package com.PetShop.domain.repository;

import com.PetShop.domain.dto.PetDTO;

import java.util.List;
import java.util.Optional;

public interface PetDomainRepository {
    List<PetDTO> getAll();
    Optional<PetDTO> getPetById(int id);
    PetDTO save(PetDTO petDTO);
    void delete(int id);
    boolean existsPet(int id);
    long countAll();
}
