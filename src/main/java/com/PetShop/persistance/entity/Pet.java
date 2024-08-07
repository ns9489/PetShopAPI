package com.PetShop.persistance.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "petID")
    private Integer id;

    @Column(name = "namePet")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @ManyToMany
    @JoinTable(
            name = "Pet_Veterinarian",
            joinColumns = @JoinColumn(name = "petID"),
            inverseJoinColumns = @JoinColumn(name = "veterinarianID")
    )
    private List<Veterinarian> veterinarians;

    // Getters y Setters
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

    public List<Veterinarian> getVeterinarians() {
        return veterinarians;
    }

    public void setVeterinarians(List<Veterinarian> veterinarians) {
        this.veterinarians = veterinarians;
    }
}
