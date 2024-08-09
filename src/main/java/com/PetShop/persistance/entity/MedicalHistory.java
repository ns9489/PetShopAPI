package com.PetShop.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicalHistory")
public class MedicalHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "petID")
    private String PetID;

    @Column (name = "appointmentID")
    private String appointmentID;

    @Column (name = "allergies")
    private String allergies;

    @Column (name = "previousTreatment")
    private String previousTreatment;

    @Column (name = "previousMedications")
    private String previousMedications;

    @OneToMany
    private List<MedicalHistory> medicalHistoryList;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPetID() {
        return PetID;
    }

    public void setPetID(String petID) {
        PetID = petID;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
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

    public List<MedicalHistory> getMedicalHistoryList() {
        return medicalHistoryList;
    }

    public void setMedicalHistoryList(List<MedicalHistory> medicalHistoryList) {
        this.medicalHistoryList = medicalHistoryList;
    }
}