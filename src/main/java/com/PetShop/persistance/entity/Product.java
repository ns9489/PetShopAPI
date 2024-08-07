package com.PetShop.persistance.entity;

import jakarta.persistence.*;


    @Entity
    @Table(name = "product")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;


        @ManyToOne
        @JoinColumn(name = "supplierID")
        private String supplier;

        @Column ( name = "nombre")
        private String  productName;

        @Column ( name = "categoria")
        private String category;

        @Column ( name = "Marca")
        private String brand;

        @Column ( name = "Precio")
        private  String price;

        public Integer getID() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }