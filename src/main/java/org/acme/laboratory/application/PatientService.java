package org.acme.laboratory.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

import org.acme.laboratory.domain.model.Patient;
import org.acme.laboratory.domain.repository.PatientRepository;


@ApplicationScoped
public class PatientService {

  @Inject
  PatientRepository patientRepository;

  public List<Patient> listPatients(){
    return patientRepository.listAll();
  }

  public Patient getPatientById(Long id){
    return patientRepository.findById(id);
  }

  public void createPatient(Patient patient){
    patientRepository.persist(patient);
  }

  public void updatePatient(Patient patient){
    patientRepository.persist(patient);
  }

  public void deletePatient(Long id){
    patientRepository.deleteById(id);
  }
}
