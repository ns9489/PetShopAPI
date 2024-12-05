package com.PetShop.domain.repository;

import com.PetShop.domain.dto.VeterinarianDTO;

import java.util.List;
import java.util.Optional;

public interface VeterinarianDomainRepository {
    List<VeterinarianDTO> getAll();
    Optional<VeterinarianDTO> getVeterinarianById(int id);
    VeterinarianDTO save(VeterinarianDTO veterinarianDTO);
    void delete(int id);
    boolean existsVeterinarian(int id);
    long countAll();
}
