package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.OwnerDTO;
import com.PetShop.persistence.entity.Owner;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {
    @Mappings({
            @Mapping(source = "id", target = "ownerId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "address", target = "address"),
    })
    OwnerDTO toOwnerDTO(Owner owner);
    List<OwnerDTO> toOwnerDTO(List<Owner> owners);

    @InheritInverseConfiguration
    @Mapping(target = "pet", ignore = true)
    Owner toOwner(OwnerDTO ownerDTO);
}
