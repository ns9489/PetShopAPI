package com.PetShop.domain;

public class AppointmentDetailsDomain {
    private Integer appointmentId;
    private MedicalAppointmentDomain medicalAppointment;
    private PetDomain pet;  // Asegúrate de que este nombre coincida con el mappedBy en PetDomain

    // Getters and Setters

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public MedicalAppointmentDomain getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointmentDomain medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public PetDomain getPet() {
        return pet;
    }

    public void setPet(PetDomain pet) {
        this.pet = pet;
    }
}
