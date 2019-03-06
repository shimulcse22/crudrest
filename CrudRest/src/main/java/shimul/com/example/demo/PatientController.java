package shimul.com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import shimul.com.example.demo.model.Patient;
import shimul.com.example.demo.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService pateintService;
	
	@PostMapping("/patient/add")
	public void addPatient(@RequestBody Patient patient) {
		pateintService.addPatient(patient);
	}
}
