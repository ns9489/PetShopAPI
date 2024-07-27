package com.PetShop.persistance.entity;

import jakarta.persistence.*;

public class Employe {


    @Entity
    @Table(name = "Propietarios")

    public class employe {

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "Nombre")
        private String Nombre;

        @Column(name = "Apellido")
        private String Apellido;

        @Column(name = "email")
        private String email;

        @Column(name = "Citas")
        private String Citas;

        @Column(name = "Productos")
        private String Productos;

        @Column(name = "Proveedores")
        private String Proveedores;

        @Column(name = "Factura")
        private String Factura;

        @Column(name = "Historia medica")
        private String HistoriaMedica;

        @Column(name = "Veterinario")
        private String Veterinario;

        @Column(name = "Cargo")
        private String Cargo;

    }
}
