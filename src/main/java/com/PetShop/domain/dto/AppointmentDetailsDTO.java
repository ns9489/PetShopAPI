package com.PetShop.domain.dto;

public class AppointmentDetailsDTO {
    private Integer appointmentId;
    private MedicalAppointmentDTO medicalAppointment;
    private PetDTO pet;

    // Getters and Setters

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public MedicalAppointmentDTO getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointmentDTO medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public PetDTO getPet() {
        return pet;
    }

    public void setPet(PetDTO pet) {
        this.pet = pet;
    }
}
