package shimul.com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shimul.com.example.demo.model.Patient;
import shimul.com.example.demo.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public void addPatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient getPatient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}
  
}
