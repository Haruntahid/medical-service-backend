package com.medical.medical_service.service;

import com.medical.medical_service.model.PrescriptionModel;
import com.medical.medical_service.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    //get all prescription
    public List<PrescriptionModel> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

//    save prescription
    public PrescriptionModel savePrescription(PrescriptionModel prescriptionModel) {
        return prescriptionRepository.save(prescriptionModel);
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

//    update prescription
    public boolean updatePrescription(Integer id, PrescriptionModel prescriptionModel) {
        PrescriptionModel prescription = prescriptionRepository.findById(id).get();
        boolean isExist = prescriptionRepository.findById(id).isPresent();
        if (isExist) {
            prescription.setPatient_name(prescriptionModel.getPatient_name());
            prescription.setPrescription_date(prescriptionModel.getPrescription_date());
            prescription.setPatient_age(prescriptionModel.getPatient_age());
            prescription.setPatient_gender(prescriptionModel.getPatient_gender());
            prescription.setDiagnosis(prescriptionModel.getDiagnosis());
            prescription.setMedicines(prescriptionModel.getMedicines());
            prescription.setNext_visit_date(prescriptionModel.getNext_visit_date());
             prescriptionRepository.save(prescription);
             return true;
        }else{
            return false;
        }

    }

}
