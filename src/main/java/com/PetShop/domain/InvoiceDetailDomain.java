package com.PetShop.domain;

public class InvoiceDetailDomain {
    private Integer invoiceDetailId;
    private Integer quantity;
    private Double unitPrice;

    // Relationships
    private InvoiceDomain invoice;
    private ProductDomain product;

    // Getters and Setters

    public Integer getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(Integer invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public InvoiceDomain getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceDomain invoice) {
        this.invoice = invoice;
    }

    public ProductDomain getProduct() {
        return product;
    }

    public void setProduct(ProductDomain product) {
        this.product = product;
    }
}
