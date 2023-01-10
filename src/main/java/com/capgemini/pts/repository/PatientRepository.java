package com.capgemini.pts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pts.dto.PatientDto;
import com.capgemini.pts.entity.History;
import com.capgemini.pts.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	public Optional<Patient> findByEmail(String email);

	public Patient save(PatientDto patientdto);

	public List<Patient> findPatientByDoctorDoctorId(int doctorId);

}
