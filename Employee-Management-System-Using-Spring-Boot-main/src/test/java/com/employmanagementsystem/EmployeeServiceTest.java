package com.employmanagementsystem;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.employeemanagementsystem.domain.Employee;
import com.employeemanagementsystem.repository.EmployeeRepository;
import com.employeemanagementsystem.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    void testGetAllEmployees() {
        // Arrange
        Employee employee1 = new Employee("sathish","male","sathishbabu3e@gmail.com","SDE");
        Employee employee2 = new Employee("athish","male","athishbabu3fff@gmail.com","SDET");
        List<Employee> employees = Arrays.asList(employee1, employee2);

        when(employeeRepository.findAll()).thenReturn(employees);

        // Act
        List<Employee> result = employeeService.getAllEmployees();

        // Assert
        assertEquals(2, result.size());
        verify(employeeRepository, times(1)).findAll();
    }



    @Test
    void testGetEmployeeById() {
        // Arrange
        long id = 1L;
        Employee employee = new Employee();
        employee.setId(id);

        when(employeeRepository.getById(id)).thenReturn(employee);

        // Act
        Employee result = employeeService.getEmployeeById(id);

        // Assert
        assertEquals(id, result.getId());
        verify(employeeRepository, times(1)).getById(id);
    }

    @Test
    void testGetEmployeeByIdNotFound() {
        // Arrange
        long id = 6L;

        when(employeeRepository.getById(id)).thenReturn(null);

        // Act and Assert
        assertThrows(RuntimeException.class, () -> employeeService.getEmployeeById(id));
        verify(employeeRepository, times(1)).getById(id);
    }

    @Test
    void testDeleteEmployeeById() {
        // Arrange
        long id = 1L;
        Employee employee = new Employee();
        employee.setId(id);

        when(employeeRepository.getById(id)).thenReturn(employee);

        // Act
        String result = employeeService.deleteEmployeeById(id);

        // Assert
        assertEquals("Deleted: " + employee.getEmpName(), result);
        verify(employeeRepository, times(1)).deleteById(id);
    }

    @Test
    void testDeleteEmployeeByIdNotFound() {
        // Arrange
        long id = 1L;

        when(employeeRepository.getById(id)).thenReturn(null);

        // Act and Assert
        assertThrows(RuntimeException.class, () -> employeeService.deleteEmployeeById(id));
        verify(employeeRepository, times(1)).getById(id);
    }
}
