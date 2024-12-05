package com.PetShop.domain.service;

import com.PetShop.domain.dto.PetDTO;
import com.PetShop.domain.repository.PetDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetDomainRepository petDomainRepository;

    public List<PetDTO> getAll() {
        return petDomainRepository.getAll();
    }

    public Optional<PetDTO> getPetById(int id) {
        return petDomainRepository.getPetById(id);
    }

    public PetDTO save(PetDTO petDTO) {
        return petDomainRepository.save(petDTO);
    }

    public boolean delete(int id) {
        return getPetById(id).map(pet -> {
            petDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsPet(int id) {
        return petDomainRepository.existsPet(id);
    }

    public long countAll() {
        return petDomainRepository.countAll();
    }
}
