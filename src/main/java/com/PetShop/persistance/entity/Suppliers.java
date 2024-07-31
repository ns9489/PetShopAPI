package com.PetShop.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

public class Suppliers {

    @Entity
    @Table(name = "Suppliers")
    public class suppliers{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;

        @Column(name = "Nombre")
        private String supplierName;

        @Column(name = "Direccion")
        private String supplierAddress;

        @Column(name = "CorreoElectronico")
        private String supplierEmail;

        @Column(name = "telefono")
        private String getSupplierPhone;

        @OneToMany(mappedBy = "suppliers")
        private List<Product.product> products;
    }
}
