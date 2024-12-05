package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.AppointmentDetailsDTO;
import com.PetShop.persistence.entity.AppointmentDetails;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring" , uses = {MedicalAppointmentMapper.class, PetMapper.class})
public interface AppointmentDetailsMapper {
    @Mappings({
            @Mapping(source = "id", target = "appointmentId"),
            @Mapping(source = "medicalAppointment", target = "medicalAppointment"),
            @Mapping(source = "pet", target = "pet")
    })
    AppointmentDetailsDTO toAppointmentDetailsDTO(AppointmentDetails appointmentDetail);
    List<AppointmentDetailsDTO> toAppointmentDetailsDTO(List<AppointmentDetails> appointmentDetails);

    @InheritInverseConfiguration
    AppointmentDetails toAppointmentDetails(AppointmentDetailsDTO appointmentDetailsDTO);
}
