package com.medical.medical_service.controller;

import com.medical.medical_service.model.dtos.PrescriptionDTO;
import com.medical.medical_service.model.entity.Prescription;
import com.medical.medical_service.model.mapper.PrescriptionMapper;
import com.medical.medical_service.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;
    @Autowired
    private PrescriptionMapper prescriptionMapper;


    // get all prescription
    @GetMapping("/api/v1/prescription")
    public List<Prescription> getAllPrescription(){
        return prescriptionService.getAllPrescriptions();
    }

    // create a prescription entry
    @PostMapping("/prescription")
    public ResponseEntity<Prescription> save(@RequestBody Prescription prescription) {
        return ResponseEntity.ok(prescriptionService.savePrescription(prescription));
    }

    // delete a prescription entry
    @DeleteMapping("/prescription/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        boolean isExist = prescriptionService.deletePrescription(id);
        if (!isExist) {
            return ResponseEntity.ok("Prescription deleted Unsuccessfully");
        } else {
            return ResponseEntity.ok("Prescription deleted Successfully");
        }
    }

    //  update a prescription entry
    @PutMapping("/prescription/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PrescriptionDTO  dto) {
        Optional<Prescription> exPrescription = prescriptionService.findById(id);
        if (exPrescription.isPresent()) {
            Prescription prescription =  prescriptionMapper.map(exPrescription.get(), dto);
            prescriptionService.savePrescription(prescription);
        } else return ResponseEntity.ok("Prescription update Unsuccessfully");
        return ResponseEntity.ok("Prescription update Successfully");
    }


}
