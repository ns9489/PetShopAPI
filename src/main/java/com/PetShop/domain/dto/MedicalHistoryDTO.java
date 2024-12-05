package com.PetShop.domain.dto;

public class MedicalHistoryDTO {
    private Integer medicalHistoryId;
    private String allergies;
    private String previousTreatment;
    private String previousMedications;

    // Relationships
    private PetDTO pet;
    private MedicalAppointmentDTO medicalAppointment;

    // Getters and Setters

    public Integer getMedicalHistoryId() {
        return medicalHistoryId;
    }

    public void setMedicalHistoryId(Integer medicalHistoryId) {
        this.medicalHistoryId = medicalHistoryId;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPreviousTreatment() {
        return previousTreatment;
    }

    public void setPreviousTreatment(String previousTreatment) {
        this.previousTreatment = previousTreatment;
    }

    public String getPreviousMedications() {
        return previousMedications;
    }

    public void setPreviousMedications(String previousMedications) {
        this.previousMedications = previousMedications;
    }

    public PetDTO getPet() {
        return pet;
    }

    public void setPet(PetDTO pet) {
        this.pet = pet;
    }

    public MedicalAppointmentDTO getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointmentDTO medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}
