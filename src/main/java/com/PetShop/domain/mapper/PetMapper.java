package com.petShopAPI.domain.mapper;

import com.petShopAPI.domain.dto.PetDTO;
import com.petShopAPI.persistence.entity.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PetMapper {

    @Mapping(source = "owner.id", target = "ownerId")
    PetDTO toPetDTO(Pet pet);

    @Mapping(source = "ownerId", target = "owner.id")
    Pet toPet(PetDTO petDTO);
}
