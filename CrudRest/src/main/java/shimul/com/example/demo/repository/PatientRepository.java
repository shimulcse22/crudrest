package shimul.com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import shimul.com.example.demo.model.Patient;

public interface PatientRepository extends CrudRepository<Patient,Integer>{

}
