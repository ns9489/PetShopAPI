package com.PetShop.persistance.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "medicalAppointment")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointmentID")
    private Integer id;

    @Column(name = "appointmentDate")
    private java.sql.Date date;

    @Column(name = "appointmentTime")
    private java.sql.Time time;

    @Column(name = "appointmentCost")
    private Double cost;

    @ManyToOne
    @JoinColumn(name = "veterinarianID")
    private Veterinarian veterinarian;

    @OneToMany(mappedBy = "appointment")
    private List<AppointmentDetail> appointmentDetails;

    @OneToMany(mappedBy = "appointment")
    private List<Invoice> invoices;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public java.sql.Time getTime() {
        return time;
    }

    public void setTime(java.sql.Time time) {
        this.time = time;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public List<AppointmentDetail> getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(List<AppointmentDetail> appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
