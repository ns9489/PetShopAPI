package com.PetShop.domain.service;

import com.PetShop.domain.dto.InvoiceDetailDTO;
import com.PetShop.domain.repository.InvoiceDetailDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceDetailService {

    @Autowired
    private InvoiceDetailDomainRepository invoiceDetailDomainRepository;

    public List<InvoiceDetailDTO> getAll() {
        return invoiceDetailDomainRepository.getAll();
    }

    public Optional<InvoiceDetailDTO> getInvoiceDetailById(int id) {
        return invoiceDetailDomainRepository.getInvoiceDetailById(id);
    }

    public InvoiceDetailDTO save(InvoiceDetailDTO invoiceDetailDTO) {
        return invoiceDetailDomainRepository.save(invoiceDetailDTO);
    }

    public boolean delete(int id) {
        return getInvoiceDetailById(id).map(invoiceDetail -> {
            invoiceDetailDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsInvoiceDetail(int id) {
        return invoiceDetailDomainRepository.existsInvoiceDetail(id);
    }

    public long countAll() {
        return invoiceDetailDomainRepository.countAll();
    }
}
