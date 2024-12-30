package com.medical.medical_service.service;

import com.medical.medical_service.model.entity.Medicine;
import com.medical.medical_service.model.mapper.MedicineMapper;
import com.medical.medical_service.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepository medicineRepository;

    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

}
