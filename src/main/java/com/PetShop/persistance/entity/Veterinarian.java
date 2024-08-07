package com.PetShop.persistance.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "veterinarian")
public class Veterinarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veterinarianID")
    private Integer id;

    @Column(name = "veterinarianFirstName")
    private String firstName;

    @Column(name = "veterinarianLastName")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "veterinarianPhone")
    private String phone;

    @Column(name = "veterinarianEmail")
    private String email;

    @Column(name = "age")
    private Integer age; // Cambiado de String a Integer

    @ManyToMany(mappedBy = "veterinarians")
    private List<Pet> pets;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
