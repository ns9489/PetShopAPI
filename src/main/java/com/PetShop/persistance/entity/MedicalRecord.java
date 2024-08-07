package com.PetShop.persistance.entity;

import jakarta.persistence.*;

@Entity
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "Nombres")
    private String ownerFirstName;
}