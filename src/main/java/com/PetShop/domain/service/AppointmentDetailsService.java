package com.PetShop.domain.service;

import com.PetShop.domain.dto.AppointmentDetailsDTO;
import com.PetShop.domain.repository.AppointmentDetailsDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentDetailsService {

    @Autowired
    private AppointmentDetailsDomainRepository appointmentDetailsDomainRepository;

    public List<AppointmentDetailsDTO> getAll() {
        return appointmentDetailsDomainRepository.getAll();
    }

    public Optional<AppointmentDetailsDTO> getAppointmentDetailsById(int id) {
        return appointmentDetailsDomainRepository.getAppointmentDetailsById(id);
    }

    public AppointmentDetailsDTO save(AppointmentDetailsDTO appointmentDetailsDTO) {
        return appointmentDetailsDomainRepository.save(appointmentDetailsDTO);
    }

    public boolean delete(int id) {
        return getAppointmentDetailsById(id).map(details -> {
            appointmentDetailsDomainRepository.deleteById(id);
            return true;
        }).orElse(false);
    }

    public long countAll() {
        return appointmentDetailsDomainRepository.countAll();
    }
}
