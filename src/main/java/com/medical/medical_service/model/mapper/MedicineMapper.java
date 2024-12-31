package com.medical.medical_service.model.mapper;

import com.medical.medical_service.model.dtos.MedicineDTO;
import com.medical.medical_service.model.entity.Medicine;
import org.springframework.stereotype.Component;

@Component
public class MedicineMapper {
    public  Medicine map(MedicineDTO dto) {
        Medicine entity = new Medicine();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setStrength(dto.getStrength());
        return entity;
    }

    public  MedicineDTO map(Medicine entity) {
        MedicineDTO dto = new MedicineDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        dto.setStrength(entity.getStrength());
        return dto;
    }
}
