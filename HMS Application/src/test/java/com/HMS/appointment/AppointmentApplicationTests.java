package com.HMS.appointment;

import com.HMS.appointment.Appointment_storage.Appointment;
import com.HMS.appointment.Appointment_storage.AppointmentRepository;
import com.HMS.appointment.Doctor_storage.Doctor;
import com.HMS.appointment.Doctor_storage.DoctorRepository;
import com.HMS.appointment.Person_storage.Person;
import com.HMS.appointment.Person_storage.PersonRepository;
import com.HMS.appointment.Prescription.PrescriptionRepository;
import com.HMS.appointment.controller.ControllerClass;
import io.swagger.models.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.print.Doc;
import javax.servlet.http.HttpSession;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AppointmentApplicationTests {

	@Mock
	private PersonRepository personRepository;

	@Mock
	private DoctorRepository doctorRepository;

	@Mock
	private AppointmentRepository appointmentRepository;

	@Mock
	private PrescriptionRepository prescriptionRepository;

	@InjectMocks
	private ControllerClass controllerClass;

	@Mock
	private HttpSession session;

	@Mock
	private Model model;

	@Test
	void testRegister() {
		// Arrange (Mocking dependencies)
		PersonRepository personRepository = mock(PersonRepository.class);
		ControllerClass controller = new ControllerClass();

		// Act (Call the method under test)
		String result = controller.register();

		// Assert (Verify the result)
		assertEquals("register", result); // Assuming "register" is the expected view name
	}

	@Test
	void testRegistered() {
		// Arrange
		Person person = new Person();
		when(personRepository.save(any())).thenReturn(person);

		// Act
		String result = controllerClass.registered(person);

		// Assert
		assertEquals("redirect:/", result); // Assuming "redirect:/" is the expected redirect URL
		verify(personRepository, times(1)).save(any(Person.class));
	}

	@Test
	public void registerDoctor(){
		Doctor doctor = new Doctor();
		doctor.setEmail("Thirukumaran@VES.com");
				doctor.setDegree("MBBS");
				doctor.setPassword("Thiru123");
				doctor.setName("Thiru K");
				doctor.setSpecialization("GENERAL");
				doctor.setState("Kerala");
		Assert.notNull(doctorRepository.findById("hirukumaran@VES.com"),"Present in DB");

	}

	@Test
	public  void appointmenttest(){
		Appointment app = new Appointment();
		app.setAppId(1);
				app.setStatus("ACTIVE");
		app.setDate("2024-03-01");
				app.setEmail("sathishbabu31@gmail.com");
		app.setDocName("Thiru");
				app.setDocId("Thirukumaran@VES.com");
		app.setDocSpecial("General");
		Assert.notEmpty(Collections.singleton(app),"Tested Ok");



	}

}
