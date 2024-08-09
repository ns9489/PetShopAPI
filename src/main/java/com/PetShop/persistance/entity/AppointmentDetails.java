package com.PetShop.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "appointmentDetails")
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "appointmentDetailsID" )
    private Integer id;

    @Column(name = "namePet")
    private String name;

}
