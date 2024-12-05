package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceCrudRepository extends CrudRepository<Invoice,Integer> {
}
