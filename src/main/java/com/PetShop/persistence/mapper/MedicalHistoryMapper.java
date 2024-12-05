package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.MedicalHistoryDTO;
import com.PetShop.persistence.entity.MedicalHistory;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PetMapper.class, MedicalAppointmentMapper.class})
public interface MedicalHistoryMapper {
    @Mappings({
            @Mapping(source = "id", target = "medicalHistoryId"),
            @Mapping(source = "allergies", target = "allergies"),
            @Mapping(source = "previousTreatment", target = "previousTreatment"),
            @Mapping(source = "previousMedications", target = "previousMedications"),
            @Mapping(source = "pet", target = "pet"),
            @Mapping(source = "medicalAppointment", target = "medicalAppointment")
    })
    MedicalHistoryDTO toMedicalHistoryDTO(MedicalHistory medicalHistory);
    List<MedicalHistoryDTO> toMedicalHistoryDTO(List<MedicalHistory> medicalHistorys);

    @InheritInverseConfiguration
    MedicalHistory toMedicalHistory(MedicalHistoryDTO medicalHistoryDTO);
}
