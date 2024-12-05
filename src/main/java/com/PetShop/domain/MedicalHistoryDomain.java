package com.PetShop.domain;

public class MedicalHistoryDomain {
    private Integer medicalHistoryId;
    private String allergies;
    private String previousTreatment;
    private String previousMedications;

    // Relationships
    private PetDomain pet;
    private MedicalAppointmentDomain medicalAppointment;

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

    public PetDomain getPet() {
        return pet;
    }

    public void setPet(PetDomain pet) {
        this.pet = pet;
    }

    public MedicalAppointmentDomain getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointmentDomain medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}
