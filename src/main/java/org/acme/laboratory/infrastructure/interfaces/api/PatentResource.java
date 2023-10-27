package org.acme.laboratory.infrastructure.interfaces.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import org.acme.laboratory.application.PatientService;
import org.acme.laboratory.domain.model.Patient;

@Path("/patent")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PatentResource {
  @Inject
  PatientService patientService;

  @GET
  public List<Patient> ListPatent(){
    List<Patient> patients = patientService.listPatients();
    return patients;
  }

  @GET
  @Path("/{id}")
  public Patient GetPatientById(@PathParam("id") Long id){
    return patientService.getPatientById(id);
  }

  @POST
  public void createPatient(Patient patient){
    patientService.createPatient(patient);
  }

  @PUT
  @Path("/{id}")
  public void updatePatient(@PathParam("id") Long id, Patient patient){
    patientService.updatePatient(patient);
  }

  @DELETE
  @Path("/{id}")
  public void deletePatient(@PathParam("id") Long id){
    patientService.deletePatient(id);
  }
}
