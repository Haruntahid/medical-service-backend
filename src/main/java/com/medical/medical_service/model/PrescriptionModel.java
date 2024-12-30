package com.medical.medical_service.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prescription")
public class PrescriptionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date Prescription_date;
    private String Patient_name;
    private int Patient_age;
    private String Patient_gender;
    private String Diagnosis;
    private String Medicines;
    private Date Next_visit_date;


    public PrescriptionModel(int id, Date prescription_date, String patient_name, int patient_age, String patient_gender, String diagnosis, String medicines, Date next_visit_date) {
        this.id = id;
        Prescription_date = prescription_date;
        Patient_name = patient_name;
        Patient_age = patient_age;
        Patient_gender = patient_gender;
        Diagnosis = diagnosis;
        Medicines = medicines;
        Next_visit_date = next_visit_date;
    }

    public PrescriptionModel() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPrescription_date() {
        return Prescription_date;
    }

    public void setPrescription_date(Date prescription_date) {
        Prescription_date = prescription_date;
    }

    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String patient_name) {
        Patient_name = patient_name;
    }

    public int getPatient_age() {
        return Patient_age;
    }

    public void setPatient_age(int patient_age) {
        Patient_age = patient_age;
    }

    public String getPatient_gender() {
        return Patient_gender;
    }

    public void setPatient_gender(String patient_gender) {
        Patient_gender = patient_gender;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getMedicines() {
        return Medicines;
    }

    public void setMedicines(String medicines) {
        Medicines = medicines;
    }

    public Date getNext_visit_date() {
        return Next_visit_date;
    }

    public void setNext_visit_date(Date next_visit_date) {
        Next_visit_date = next_visit_date;
    }
}
