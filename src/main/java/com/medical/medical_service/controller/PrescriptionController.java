package com.medical.medical_service.controller;

import com.medical.medical_service.model.PrescriptionModel;
import com.medical.medical_service.repository.PrescriptionRepository;
import com.medical.medical_service.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;


    // get all prescription
    @GetMapping("/api/v1/prescription")
    public List<PrescriptionModel> getAllPrescription(){
        return prescriptionService.getAllPrescriptions();
    }

    // create a prescription entry
    @PostMapping("/prescription")
    public ResponseEntity<PrescriptionModel> save(@RequestBody PrescriptionModel prescriptionModel) {
        return ResponseEntity.ok(prescriptionService.savePrescription(prescriptionModel));
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
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PrescriptionModel prescriptionModel) {
        boolean isUpdate = prescriptionService.updatePrescription(id, prescriptionModel);

        if (isUpdate) {
            return ResponseEntity.ok("Prescription updated Successfully");
        }else {
            return ResponseEntity.ok("Sorry Not Updated!!");
        }
    }


}
