package com.PetShop.persistence.crud;
import java.util.List;
import com.PetShop.persistence.entity.Pet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PetCrudRepository extends CrudRepository<Pet,Integer> {
}
