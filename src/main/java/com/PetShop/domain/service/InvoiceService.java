package com.PetShop.domain.service;

import com.PetShop.domain.dto.InvoiceDTO;
import com.PetShop.domain.repository.InvoiceDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceDomainRepository invoiceDomainRepository;

    public List<InvoiceDTO> getAll() {
        return invoiceDomainRepository.getAll();
    }

    public Optional<InvoiceDTO> getInvoiceById(int id) {
        return invoiceDomainRepository.getInvoiceById(id);
    }

    public InvoiceDTO save(InvoiceDTO invoiceDTO) {
        return invoiceDomainRepository.save(invoiceDTO);
    }

    public boolean delete(int id) {
        return getInvoiceById(id).map(invoice -> {
            invoiceDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsInvoice(int id) {
        return invoiceDomainRepository.existsInvoice(id);
    }

    public long countAll() {
        return invoiceDomainRepository.countAll();
    }
}
