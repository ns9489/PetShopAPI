package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.VeterinarianDTO;
import com.PetShop.persistence.entity.Veterinarian;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VeterinarianMapper {
    @Mappings({
            @Mapping(source = "id", target = "veterinarianId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "position", target = "position"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "age", target = "age")
    })
    VeterinarianDTO toVeterinarianDTO (Veterinarian veterinarian);
    List<VeterinarianDTO> toVeterinarianDTO (List<Veterinarian> veterinarians);

    @InheritInverseConfiguration
    @Mapping(target = "medicalAppointment", ignore = true)
    Veterinarian toVeterinarian (VeterinarianDTO toVeterinarianDTO);
}
