package com.medical.medical_service.model.dtos;



import java.util.Date;
import java.util.List;

public class PrescriptionDTO {

    private Long id;
    private Date prescriptionDate;
    private String patientName;
    private int patientAge;
    private String patientGender;
    private String diagnosis;
    private List<MedicineDTO> medicines;
    private Date nextVisitDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<MedicineDTO> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<MedicineDTO> medicines) {
        this.medicines = medicines;
    }

    public Date getNextVisitDate() {
        return nextVisitDate;
    }

    public void setNextVisitDate(Date nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }
}
