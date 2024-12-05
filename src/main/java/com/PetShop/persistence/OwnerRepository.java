package com.PetShop.persistence;

import com.PetShop.domain.dto.OwnerDTO;
import com.PetShop.domain.repository.OwnerDomainRepository;
import com.PetShop.persistence.crud.OwnerCrudRepository;
import com.PetShop.persistence.entity.Owner;
import com.PetShop.persistence.mapper.OwnerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OwnerRepository implements OwnerDomainRepository {
    @Autowired
    private OwnerMapper ownerMapper;

    @Autowired
    private OwnerCrudRepository ownerCrudRepository;

    @Override
    public List<OwnerDTO> getAll() {
        List<Owner> owners = (List<Owner>) ownerCrudRepository.findAll();
        return ownerMapper.toOwnerDTO(owners);
    }

    @Override
    public Optional<OwnerDTO> getOwnerById(int id) {
        return ownerCrudRepository.findById(id).map(ownerMapper::toOwnerDTO);
    }

    @Override
    public OwnerDTO save(OwnerDTO ownerDTO) {
        Owner owner = ownerMapper.toOwner(ownerDTO);
        return ownerMapper.toOwnerDTO(ownerCrudRepository.save(owner));
    }

    @Override
    public void delete(int id) {
        ownerCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsOwner(int id) {
        return ownerCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return ownerCrudRepository.count();
    }
}
