package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Pet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PetCrudRepository extends CrudRepository<Pet,Integer>{

    @Query(value = " SELECT * FROM mascotas WHERE especies = :especies ORDER BY id_pet ASC", nativeQuery = true)
    List<Pet> findBySpeciesOrderByNameAsc(@Param("especies") String species);
}
