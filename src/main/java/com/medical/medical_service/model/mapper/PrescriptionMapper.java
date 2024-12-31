package com.medical.medical_service.model.mapper;

import com.medical.medical_service.model.dtos.MedicineDTO;
import com.medical.medical_service.model.dtos.PrescriptionDTO;
import com.medical.medical_service.model.entity.Medicine;
import com.medical.medical_service.model.entity.Prescription;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrescriptionMapper {

    private MedicineMapper medicineMapper;
    public Prescription map(PrescriptionDTO dto) {
        Prescription entity = new Prescription();

        entity.setPrescriptionDate(dto.getPrescriptionDate());
        entity.setPatientName(dto.getPatientName());
        entity.setPatientAge(dto.getPatientAge());
        entity.setPatientGender(dto.getPatientGender());
        entity.setDiagnosis(dto.getDiagnosis());

        List<Medicine> medicines  = new ArrayList<>();

        for (MedicineDTO medicineDTO :dto.getMedicines()){
            System.out.println(medicineDTO);
            medicines.add(medicineMapper.map(medicineDTO));
        }
        entity.setMedicines(medicines);
        entity.setNextVisitDate(dto.getNextVisitDate());
        return entity;
    }


    public Prescription map(Prescription exEntity, PrescriptionDTO dto){
        exEntity.setPrescriptionDate(dto.getPrescriptionDate());
        exEntity.setPatientName(dto.getPatientName());
        exEntity.setPatientAge(dto.getPatientAge());
        exEntity.setPatientGender(dto.getPatientGender());
        exEntity.setDiagnosis(dto.getDiagnosis());
        List<Medicine> medicines  = new ArrayList<>();
        for (MedicineDTO medicineDTO :dto.getMedicines()){
            medicines.add(medicineMapper.map(medicineDTO));
        }
        exEntity.setMedicines(medicines);
        exEntity.setNextVisitDate(dto.getNextVisitDate());
        return exEntity;
    }



}
