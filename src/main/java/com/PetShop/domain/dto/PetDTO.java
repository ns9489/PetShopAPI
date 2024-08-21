package com.PetShop.domain.dto;


import lombok.Data;

@Data
public class PetDTO {
    private Integer id;
    private String name;
    private String species;
    private int age;
    private String gender;
    private Integer ownerId; // Representa el id del propietario

    // Getters y Setters
}