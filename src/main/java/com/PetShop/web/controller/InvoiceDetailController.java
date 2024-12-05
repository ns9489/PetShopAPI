package com.PetShop.web.controller;

import com.PetShop.domain.dto.InvoiceDetailDTO;
import com.PetShop.domain.service.InvoiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/invoiceDetails")
public class InvoiceDetailController {

    @Autowired
    private InvoiceDetailService invoiceDetailService;

    @GetMapping("/getAll")
    public List<InvoiceDetailDTO> getAll() {
        return invoiceDetailService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<InvoiceDetailDTO> getInvoiceDetailById(@PathVariable("id") int id) {
        return invoiceDetailService.getInvoiceDetailById(id);
    }

    @PostMapping("/save")
    public InvoiceDetailDTO save(@RequestBody InvoiceDetailDTO invoiceDetailDTO) {
        return invoiceDetailService.save(invoiceDetailDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return invoiceDetailService.delete(id);
    }

    @GetMapping("/existsInvoiceDetail/{id}")
    public boolean existsInvoiceDetail(@PathVariable("id") int id) {
        return invoiceDetailService.existsInvoiceDetail(id);
    }

    @GetMapping("/countInvoiceDetails")
    public long countInvoiceDetails() {
        return invoiceDetailService.countAll();
    }
}
