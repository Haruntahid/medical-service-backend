package com.medical.medical_service.service;

import com.medical.medical_service.model.entity.Prescription;
import com.medical.medical_service.repository.PrescriptionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    //get all prescription
    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

    //    save prescription
    @Transactional
    public Prescription savePrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    //    delete prescription
    public boolean deletePrescription(Integer id) {
        boolean idExist = prescriptionRepository.findById(id).isPresent();

        if (idExist) {
            prescriptionRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    //   get overview
//    public ResponseEntity<?> getOverview(){
//        List<Prescription> prescriptions = prescriptionRepository.findAll();
//          Set<Date> prescriptionSet = new HashSet<>();
//
//        List <Date> dates = new ArrayList<>();
//
//        for (Prescription prescription : prescriptions) {
//
//            Date priccriptionDate = prescription.getPrescriptionDate();
//            prescriptionSet.add(priccriptionDate);
//

    /// /            if (priccriptionDate == prescription.getPrescriptionDate()) {
    /// /                dates.add(priccriptionDate);
    /// /            }
//
//            dates.add(prescription.getPrescriptionDate());
//        }
//
//        return new ResponseEntity<>(dates, HttpStatus.OK);
//    }


//    get overview
    public ResponseEntity<?> getOverview() {
        List<Prescription> prescriptions = prescriptionRepository.findAll();
        HashMap<String, Integer> dateMap = new HashMap<>();
        for (Prescription prescription : prescriptions) {


            String date = prescription.getPrescriptionDate().toString().split(" ")[0];
            if (dateMap.containsKey(date)) {
                dateMap.put(date, dateMap.get(date) + 1);
            } else {
                dateMap.put(date, 1);
            }

        }
        return new ResponseEntity<>(dateMap, HttpStatus.OK);
    }


    public Optional<Prescription> findById(Integer id) {
        return prescriptionRepository.findById(id);
    }
}
