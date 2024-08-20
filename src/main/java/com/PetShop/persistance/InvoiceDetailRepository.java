package com.PetShop.persistance;

import com.PetShop.persistance.crud.InvoiceDetailCrudRepository;
import com.PetShop.persistance.entity.InvoiceDetail;

import java.util.List;
import java.util.Optional;

public class InvoiceDetailRepository {
    private InvoiceDetailCrudRepository invoiceDetailCrudRepository;

    public List<InvoiceDetail> getAll(){
        return (List<InvoiceDetail>) invoiceDetailCrudRepository.findAll();
    }

    public Optional<InvoiceDetail> getInvoiceDetailById(int id){
        return invoiceDetailCrudRepository.findById(id);
    }

    public InvoiceDetail save (InvoiceDetail invoiceDetail) {
        return invoiceDetailCrudRepository.save(invoiceDetail);
        }

        public void delete ( int id){
            invoiceDetailCrudRepository.deleteById(id);
        }

        public boolean existsInvoiceDetail ( int id){
            return invoiceDetailCrudRepository.existsById(id);
        }

        public long countAll () {
            return invoiceDetailCrudRepository.count();
        }
    }

