package com.PetShop.domain.repository;

import com.PetShop.domain.dto.AppointmentDetailsDTO;

import java.util.List;
import java.util.Optional;

public interface AppointmentDetailsDomainRepository {
    List<AppointmentDetailsDTO> getAll();
    Optional<AppointmentDetailsDTO> getAppointmentDetailsById(int id);
    AppointmentDetailsDTO save(AppointmentDetailsDTO appointmentDetailsDTO);
    void deleteById(int id);
    long countAll();
}
