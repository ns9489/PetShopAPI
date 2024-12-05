package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.MedicalAppointmentDTO;
import com.PetShop.persistence.entity.MedicalAppointment;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {VeterinarianMapper.class})
public interface MedicalAppointmentMapper {
    @Mappings({
            @Mapping(source = "id", target = "medicalAppointmentId"),
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "time", target = "time"),
            @Mapping(source = "cost", target = "cost"),
            @Mapping(source = "veterinarian", target = "veterinarian")
    })
    MedicalAppointmentDTO toMedicalAppointmentDTO(MedicalAppointment medicalAppointment);
    List<MedicalAppointmentDTO> toMedicalAppointmentDTO(List<MedicalAppointment> medicalAppointments);

    @InheritInverseConfiguration
    @Mapping(target = "invoice" , ignore = true)
    @Mapping(target = "medicalHistory" , ignore = true)
    @Mapping(target = "appointmentDetail" , ignore = true)
    MedicalAppointment toMedicalAppointment(MedicalAppointmentDTO medicalAppointmentDTO);
}
