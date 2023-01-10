package com.capgemini.pts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pts.entity.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer>{

	boolean existsByPatientPatientId(int patientId);

	List<History> findHistoryByPatientPatientId(int patientId);

}
