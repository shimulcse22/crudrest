package shimul.com.example.demo.service;

import java.util.List;

import shimul.com.example.demo.model.Patient;

public interface PatientService {
	void addPatient(Patient patient);
	void updatePatient(Patient patient);
	Patient getPatient(int id);
	List<Patient>getAllPatient();
	void deletePatient(Patient patient);
	
}
