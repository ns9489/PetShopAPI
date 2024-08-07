package com.PetShop.persistance.entity;

import jakarta.persistence.*;
import java.util.List;


    @Entity
    @Table(name = "Suppliers")
    public class Suppliers {
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
        private List<Product> products;

        public Integer getID() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getSupplierAddress() {
            return supplierAddress;
        }

        public void setSupplierAddress(String supplierAddress) {
            this.supplierAddress = supplierAddress;
        }

        public String getSupplierEmail() {
            return supplierEmail;
        }

        public void setSupplierEmail(String supplierEmail) {
            this.supplierEmail = supplierEmail;
        }

        public String getGetSupplierPhone() {
            return getSupplierPhone;
        }

        public void setGetSupplierPhone(String getSupplierPhone) {
            this.getSupplierPhone = getSupplierPhone;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }
