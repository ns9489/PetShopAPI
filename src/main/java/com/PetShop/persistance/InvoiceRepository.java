package com.PetShop.persistance;

import com.PetShop.persistance.crud.InvoiceCrudRepository;
import com.PetShop.persistance.entity.Invoice;
import com.PetShop.persistance.entity.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceRepository {
    private InvoiceCrudRepository invoiceCrudRepository;

    public List<Invoice> getAll(){
        return (List<Invoice>)invoiceCrudRepository.findAll();
    }
    public Optional<Invoice> getInvoiceByID(int id){
        return invoiceCrudRepository.findById(id);
    }
    public Invoice save (Invoice invoice){
        return invoiceCrudRepository.save( invoice);
    }
    public void delete (int id){
        invoiceCrudRepository.deleteById(id);
    }
}

