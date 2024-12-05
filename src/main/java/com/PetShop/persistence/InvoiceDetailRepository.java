package com.PetShop.persistence;

import com.PetShop.domain.dto.InvoiceDetailDTO;
import com.PetShop.domain.repository.InvoiceDetailDomainRepository;
import com.PetShop.persistence.crud.InvoiceDetailCrudRepository;
import com.PetShop.persistence.entity.InvoiceDetail;
import com.PetShop.persistence.mapper.InvoiceDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceDetailRepository implements InvoiceDetailDomainRepository {
    @Autowired
    private InvoiceDetailMapper invoiceDetailMapper;
    @Autowired
    private InvoiceDetailCrudRepository invoiceDetailCrudRepository;

    @Override
    public List<InvoiceDetailDTO> getAll() {
        List<InvoiceDetail> invoiceDetails = (List<InvoiceDetail>) invoiceDetailCrudRepository.findAll();
        return invoiceDetailMapper.toInvoiceDetailDTO(invoiceDetails);
    }

    @Override
    public Optional<InvoiceDetailDTO> getInvoiceDetailById(int id) {
        return invoiceDetailCrudRepository.findById(id).map(invoiceDetailMapper::toInvoiceDetailDTO);
    }

    @Override
    public InvoiceDetailDTO save(InvoiceDetailDTO invoiceDetailDTO) {
        InvoiceDetail invoiceDetail = invoiceDetailMapper.toInvoiceDetail(invoiceDetailDTO);
        return invoiceDetailMapper.toInvoiceDetailDTO(invoiceDetailCrudRepository.save(invoiceDetail));
    }

    @Override
    public void delete(int id) {
        invoiceDetailCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsInvoiceDetail(int id) {
        return invoiceDetailCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return invoiceDetailCrudRepository.count();
    }
}
