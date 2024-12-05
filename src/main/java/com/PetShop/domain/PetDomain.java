package com.PetShop.domain;

import java.util.List;

public class PetDomain {
    private Integer petId;
    private String name;
    private String species;
    private Integer age;
    private String gender;

    // Relationships
    private OwnerDomain owner;

    // Getters and Setters

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public OwnerDomain getOwner() {
        return owner;
    }

    public void setOwner(OwnerDomain owner) {
        this.owner = owner;
    }
}
