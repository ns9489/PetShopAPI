package com.PetShop.domain.repository;

import com.PetShop.domain.dto.InvoiceDetailDTO;

import java.util.List;
import java.util.Optional;

public interface InvoiceDetailDomainRepository {
    List<InvoiceDetailDTO> getAll();
    Optional<InvoiceDetailDTO> getInvoiceDetailById(int id);
    InvoiceDetailDTO save(InvoiceDetailDTO invoiceDetailDTO);
    void delete(int id);
    boolean existsInvoiceDetail(int id);
    long countAll();
}
