package com.PetShop.persistence;

import com.PetShop.persistence.crud.InvoiceDetailCrudRepository;
import com.PetShop.persistence.entity.InvoiceDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceDetailRepository {
    private InvoiceDetailCrudRepository invoiceDetailCrudRepository;

    public List<InvoiceDetail> getAll() {
        return (List<invoiceDetail>) invoiceDetailCrudRepository.findAll();
    }

    public Optional<invoiceDetail> getInvoiceDetailByID(int id){
        return invoiceDetailCrudRepository.findById(id);
    }

    public InvoiceDetail save(InvoiceDetail invoiceDetail){
        return invoiceDetailCrudRepository.save(invoiceDetail);
    }

    public void delete(int id){
        invoiceDetailCrudRepository.deleteById(id);
    }
}