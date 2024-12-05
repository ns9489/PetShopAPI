package com.PetShop.domain.service;

import com.PetShop.domain.dto.OwnerDTO;
import com.PetShop.domain.repository.OwnerDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    private OwnerDomainRepository ownerDomainRepository;

    public List<OwnerDTO> getAll() {
        return ownerDomainRepository.getAll();
    }

    public Optional<OwnerDTO> getOwnerById(int id) {
        return ownerDomainRepository.getOwnerById(id);
    }

    public OwnerDTO save(OwnerDTO ownerDTO) {
        return ownerDomainRepository.save(ownerDTO);
    }

    public boolean delete(int id) {
        return getOwnerById(id).map(owner -> {
            ownerDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsOwner(int id) {
        return ownerDomainRepository.existsOwner(id);
    }

    public long countAll() {
        return ownerDomainRepository.countAll();
    }
}
