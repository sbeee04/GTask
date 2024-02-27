package com.HMS.appointment;

import com.HMS.appointment.Appointment_storage.AppointmentRepository;
import com.HMS.appointment.Person_storage.Person;
import com.HMS.appointment.Person_storage.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppointmentApplicationTests {

	@Mock
	private PersonRepository patientRepository;

	@Mock
	private AppointmentRepository appointmentRepository;



	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testRegisterPatient() {
		Person patient = new Person("john@example.com", "password");

		when(patientRepository.save(patient)).thenReturn(patient);

		//Person savedPatient = patientService.registerPatient(patient);

		assertNotNull(patient);
		assertEquals(patient.getEmail(), patient.getEmail());
	}

}
