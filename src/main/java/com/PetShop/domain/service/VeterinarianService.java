package com.PetShop.domain.service;

import com.PetShop.domain.dto.VeterinarianDTO;
import com.PetShop.domain.repository.VeterinarianDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarianService {

    @Autowired
    private VeterinarianDomainRepository veterinarianDomainRepository;

    public List<VeterinarianDTO> getAll() {
        return veterinarianDomainRepository.getAll();
    }

    public Optional<VeterinarianDTO> getVeterinarianById(int id) {
        return veterinarianDomainRepository.getVeterinarianById(id);
    }

    public VeterinarianDTO save(VeterinarianDTO veterinarianDTO) {
        return veterinarianDomainRepository.save(veterinarianDTO);
    }

    public boolean deleteById(int id) {
        return getVeterinarianById(id).map(veterinarian -> {
           veterinarianDomainRepository.delete(id);
           return true;
        }).orElse(false);
    }

    public boolean existsVeterinarian(int id) {
        return veterinarianDomainRepository.existsVeterinarian(id);
    }

    public long countAll() {
        return veterinarianDomainRepository.countAll();
    }
}
