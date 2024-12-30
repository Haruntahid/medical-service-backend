package com.medical.medical_service.repository;

import com.medical.medical_service.model.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
