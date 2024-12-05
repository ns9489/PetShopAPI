package com.PetShop.persistence;

import com.PetShop.domain.dto.VeterinarianDTO;
import com.PetShop.domain.repository.VeterinarianDomainRepository;
import com.PetShop.persistence.crud.VeterinarianCrudRepository;
import com.PetShop.persistence.entity.Veterinarian;
import com.PetShop.persistence.mapper.VeterinarianMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VeterinarianRepository implements VeterinarianDomainRepository {
    @Autowired
    private VeterinarianMapper veterinarianMapper;

    @Autowired
    private VeterinarianCrudRepository veterinarianCrudRepository;

    @Override
    public List<VeterinarianDTO> getAll() {
        List<Veterinarian> veterinarians = (List<Veterinarian>) veterinarianCrudRepository.findAll();
        return veterinarianMapper.toVeterinarianDTO(veterinarians);
    }

    @Override
    public Optional<VeterinarianDTO> getVeterinarianById(int id) {
        return veterinarianCrudRepository.findById(id)
                .map(veterinarianMapper::toVeterinarianDTO);
    }

    @Override
    public VeterinarianDTO save(VeterinarianDTO veterinarianDTO) {
        Veterinarian veterinarian = veterinarianMapper.toVeterinarian(veterinarianDTO);
        return veterinarianMapper.toVeterinarianDTO(veterinarianCrudRepository.save(veterinarian));
    }

    @Override
    public void delete(int id) {
        veterinarianCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsVeterinarian(int id) {
        return veterinarianCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return veterinarianCrudRepository.count();
    }
}
