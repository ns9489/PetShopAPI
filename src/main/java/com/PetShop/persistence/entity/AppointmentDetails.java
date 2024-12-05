package com.PetShop.persistence.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "appointmentdetails")
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_detail_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private MedicalAppointment medicalAppointment;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;  // Asegúrate de que este nombre coincida con el mappedBy en Pet

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
