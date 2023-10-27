package org.acme.laboratory.domain.repository;


import org.acme.laboratory.domain.model.Patient;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PatientRepository implements PanacheRepository<Patient>{
  
}
