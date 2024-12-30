package com.medical.medical_service.controller;

import com.medical.medical_service.model.dtos.MedicineDTO;
import com.medical.medical_service.model.mapper.MedicineMapper;
import com.medical.medical_service.service.MedicineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
    private MedicineService medicineService;
    private MedicineMapper medicineMapper;

    @PostMapping("/medicine")
    public MedicineDTO save(MedicineDTO medicineDTO) {
        return medicineMapper.map(medicineService.saveMedicine(medicineMapper.map(medicineDTO)));
    }
}
