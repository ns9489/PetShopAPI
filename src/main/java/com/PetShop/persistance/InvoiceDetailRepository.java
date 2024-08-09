package com.PetShop.persistance;

import com.PetShop.persistance.crud.InvoiceCrudRepository;
import com.PetShop.persistance.entity.Invoice;
import com.PetShop.persistance.entity.InvoiceDetail;
import com.PetShop.persistance.entity.Owner;

import java.util.List;
import java.util.Optional;

public class InvoiceDetailRepository {
    private InvoiceDetailRepository invoiceDetailRepository;

    public List<InvoiceDetail> getAll(){
        return (List<Owner>) invoiceDetailRepository.findAll();
    }
    public Optional<InvoiceDetail> getInvoiceDetailByID(int id){
        return invoiceDetailRepository.findById(id);
    }
    public InvoiceDetail save (InvoiceDetail invoiceDetail){
        return invoiceDetailRepository.save( invoiceDetail);
    }
    public void delete (int id){
        invoiceDetailRepository.deleteById(id);
    }
}
