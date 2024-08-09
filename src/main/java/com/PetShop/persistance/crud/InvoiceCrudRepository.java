package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceCrudRepository extends CrudRepository<Invoice, Integer> {
}
