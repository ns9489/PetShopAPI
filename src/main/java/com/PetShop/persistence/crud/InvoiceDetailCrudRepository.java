package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.InvoiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDetailCrudRepository extends CrudRepository<InvoiceDetail, Integer> {
}
