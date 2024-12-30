package com.medical.medical_service.repository;

import com.medical.medical_service.model.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
}
