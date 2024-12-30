package com.medical.medical_service.service;

import com.medical.medical_service.model.dtos.PrescriptionDTO;
import com.medical.medical_service.model.entity.Medicine;
import com.medical.medical_service.model.entity.Prescription;
import com.medical.medical_service.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    //get all prescription
    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

//    save prescription
    public Prescription savePrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

//    delete prescription
    public boolean deletePrescription(Integer id) {
        boolean idExist = prescriptionRepository.findById(id).isPresent();

        if (idExist) {
            prescriptionRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }


    public Optional<Prescription> findById(Integer id) {
        return prescriptionRepository.findById(id);
    }
}
