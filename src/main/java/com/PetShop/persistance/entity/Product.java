package com.PetShop.persistance.entity;

import jakarta.persistence.*;

public class Product {
    @Entity
    @Table(name = "product")
    public class product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer productID;

        @ManyToOne
        @JoinColumn(name = "supplierID")
        private String supplier;
        private String productName;
        private String category;
        private String brand;

        public Integer getProductID() {
            return productID;
        }

        public void setProductID(Integer productID) {
            this.productID = productID;
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
    }
}