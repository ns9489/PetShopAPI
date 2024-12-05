package com.PetShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicalappointment")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Integer id;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "cost")
    private Double cost;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "veterinarian_id")
    private Veterinarian veterinarian;

    @OneToMany(mappedBy = "medicalAppointment")
    private List<Invoice> invoice;

    @OneToMany(mappedBy = "medicalAppointment")
    private List<MedicalHistory> medicalHistory;

    @OneToMany(mappedBy = "medicalAppointment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AppointmentDetails> appointmentDetail;

    // Getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public List<Invoice> getInvoice() {
        return invoice;
    }

    public void setInvoice(List<Invoice> invoice) {
        this.invoice = invoice;
    }

    public List<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<AppointmentDetails> getAppointmentDetail() {
        return appointmentDetail;
    }

    public void setAppointmentDetail(List<AppointmentDetails> appointmentDetail) {
        this.appointmentDetail = appointmentDetail;
    }
}
