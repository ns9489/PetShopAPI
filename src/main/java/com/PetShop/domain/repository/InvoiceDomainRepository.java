package com.PetShop.domain.repository;

import com.PetShop.domain.dto.InvoiceDTO;

import java.util.List;
import java.util.Optional;

public interface InvoiceDomainRepository {
    List<InvoiceDTO> getAll();
    Optional<InvoiceDTO> getInvoiceById(int id);
    InvoiceDTO save(InvoiceDTO invoiceDTO);
    void delete(int id);
    boolean existsInvoice(int id);
    long countAll();
}
