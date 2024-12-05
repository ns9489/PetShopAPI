package com.PetShop.domain;

import java.util.List;

public class InvoiceDomain {
    private Integer invoiceId;
    private String date;
    private String time;
    private Double totalAmount;
    private Double totalReceived;
    private Double totalReturn;

    // Relationships
    private EmployeeDomain employee;
    private MedicalAppointmentDomain medicalAppointment;

    // Getters and Setters

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalReceived() {
        return totalReceived;
    }

    public void setTotalReceived(Double totalReceived) {
        this.totalReceived = totalReceived;
    }

    public Double getTotalReturn() {
        return totalReturn;
    }

    public void setTotalReturn(Double totalReturn) {
        this.totalReturn = totalReturn;
    }

    public EmployeeDomain getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDomain employee) {
        this.employee = employee;
    }

    public MedicalAppointmentDomain getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointmentDomain medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}
