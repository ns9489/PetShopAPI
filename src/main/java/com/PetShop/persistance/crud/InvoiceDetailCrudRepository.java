package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.InvoiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDetailCrudRepository extends CrudRepository<InvoiceDetail, Integer> {
}
