package com.medical.medical_service.repository;

import com.medical.medical_service.model.PrescriptionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<PrescriptionModel, Integer> {
}
