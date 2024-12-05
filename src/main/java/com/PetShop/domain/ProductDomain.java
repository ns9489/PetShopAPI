package com.PetShop.domain;

import java.util.List;

public class ProductDomain {
    private Integer productId;
    private String name;
    private String category;
    private String brand;
    private Double price;

    // Relationships
    private SupplierDomain supplier;

    // Getters and Setters

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SupplierDomain getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierDomain supplier) {
        this.supplier = supplier;
    }
}
