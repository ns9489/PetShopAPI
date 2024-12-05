package com.PetShop.web.controller;

import com.PetShop.domain.dto.InvoiceDTO;
import com.PetShop.domain.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/getAll")
    public List<InvoiceDTO> getAll() {
        return invoiceService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<InvoiceDTO> getInvoiceById(@PathVariable("id") int id) {
        return invoiceService.getInvoiceById(id);
    }

    @PostMapping("/save")
    public InvoiceDTO save(@RequestBody InvoiceDTO invoiceDTO) {
        return invoiceService.save(invoiceDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return invoiceService.delete(id);
    }

    @GetMapping("/existsInvoice/{id}")
    public boolean existsInvoice(@PathVariable("id") int id) {
        return invoiceService.existsInvoice(id);
    }

    @GetMapping("/countInvoices")
    public long countInvoices() {
        return invoiceService.countAll();
    }
}
