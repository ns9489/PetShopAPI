package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.PetDTO;
import com.PetShop.persistence.entity.Pet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OwnerMapper.class})
public interface PetMapper {
    @Mappings({
            @Mapping(source = "id", target = "petId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "species", target = "species"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "gender", target = "gender"),
            @Mapping(source = "owner", target = "owner")
    })
    PetDTO toPetDTO(Pet pet);
    List<PetDTO> toPetDTO(List<Pet> pets);

    @InheritInverseConfiguration
    @Mapping(target = "medicalHistory", ignore = true)
    @Mapping(target = "appointmentDetail", ignore = true)
    Pet toPet(PetDTO petDTO);
}
