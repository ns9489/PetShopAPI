package com.PetShop.domain.dto;

public class MedicalAppointmentDTO {
    private Integer medicalAppointmentId;
    private String date;
    private String time;
    private Double cost;

    // Relationships
    private VeterinarianDTO veterinarian;

    // Getters and Setters

    public Integer getMedicalAppointmentId() {
        return medicalAppointmentId;
    }

    public void setMedicalAppointmentId(Integer medicalAppointmentId) {
        this.medicalAppointmentId = medicalAppointmentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public VeterinarianDTO getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(VeterinarianDTO veterinarian) {
        this.veterinarian = veterinarian;
    }
}
