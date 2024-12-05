package com.PetShop.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Pet")  // Nombre de la tabla en la base de datos
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    // relationships
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany (mappedBy = "pet")
    private List<MedicalHistory> medicalHistory;

    @OneToMany (mappedBy = "pet")
    private List<AppointmentDetails> appointmentDetail;

    // getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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
