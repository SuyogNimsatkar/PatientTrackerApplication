package com.capgemini.pts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pts.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	public Optional<Doctor> findByDoctorEmail(String doctorEmail);

	public Doctor findByDoctorId(int doctorId);

	public List<Doctor> findAllByStatus(String status);
}
