package com.PetShop.persistence;

import com.PetShop.domain.dto.InvoiceDTO;
import com.PetShop.domain.repository.InvoiceDomainRepository;
import com.PetShop.persistence.crud.InvoiceCrudRepository;
import com.PetShop.persistence.entity.Invoice;
import com.PetShop.persistence.mapper.InvoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceRepository implements InvoiceDomainRepository {
    @Autowired
    private InvoiceMapper invoiceMapper;

    @Autowired
    private InvoiceCrudRepository invoiceCrudRepository;

    @Override
    public List<InvoiceDTO> getAll() {
        List<Invoice> invoices = (List<Invoice>) invoiceCrudRepository.findAll();
        return invoiceMapper.toInvoiceDTO(invoices);
    }

    @Override
    public Optional<InvoiceDTO> getInvoiceById(int id) {
        return invoiceCrudRepository.findById(id).map(invoiceMapper::toInvoiceDTO);
    }

    @Override
    public InvoiceDTO save(InvoiceDTO invoiceDTO) {
        Invoice invoice = invoiceMapper.toInvoice(invoiceDTO);
        return invoiceMapper.toInvoiceDTO(invoiceCrudRepository.save(invoice));
    }

    @Override
    public void delete(int id) {
        invoiceCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsInvoice(int id) {
        return invoiceCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return invoiceCrudRepository.count();
    }
}
