package com.PetShop.persistence;

import com.PetShop.domain.dto.PetDTO;
import com.PetShop.domain.repository.PetDomainRepository;
import com.PetShop.persistence.crud.PetCrudRepository;
import com.PetShop.persistence.entity.Pet;
import com.PetShop.persistence.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository implements PetDomainRepository {
    @Autowired
    private PetMapper petMapper;

    @Autowired
    private PetCrudRepository petCrudRepository;

    @Override
    public List<PetDTO> getAll() {
        List<Pet> pets = (List<Pet>) petCrudRepository.findAll();
        return petMapper.toPetDTO(pets);
    }

    @Override
    public Optional<PetDTO> getPetById(int id) {
        return petCrudRepository.findById(id).map(petMapper::toPetDTO);
    }

    @Override
    public PetDTO save(PetDTO petDTO) {
        Pet pet = petMapper.toPet(petDTO);
        return petMapper.toPetDTO(petCrudRepository.save(pet));
    }

    @Override
    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return petCrudRepository.count();
    }
}
