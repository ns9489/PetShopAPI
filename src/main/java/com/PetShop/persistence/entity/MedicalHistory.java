package com.PetShop.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medicalhistory")
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Integer id;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "previous_treatment")
    private String previousTreatment;

    @Column(name = "previous_medications")
    private String previousMedications;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private MedicalAppointment medicalAppointment;

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}
