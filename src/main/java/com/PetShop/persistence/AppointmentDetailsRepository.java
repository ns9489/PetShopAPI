package com.PetShop.persistence;

import com.PetShop.domain.dto.AppointmentDetailsDTO;
import com.PetShop.domain.repository.AppointmentDetailsDomainRepository;
import com.PetShop.persistence.crud.AppointmentDetailsCrudRepository;
import com.PetShop.persistence.entity.AppointmentDetails;
import com.PetShop.persistence.mapper.AppointmentDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AppointmentDetailsRepository implements AppointmentDetailsDomainRepository {

    @Autowired
    private AppointmentDetailsMapper appointmentDetailsMapper;

    @Autowired
    private AppointmentDetailsCrudRepository appointmentDetailsCrudRepository;

    @Override
    public List<AppointmentDetailsDTO> getAll() {
        List<AppointmentDetails> appointmentDetails = (List<AppointmentDetails>) appointmentDetailsCrudRepository.findAll();
        return appointmentDetailsMapper.toAppointmentDetailsDTO(appointmentDetails);
    }

    @Override
    public Optional<AppointmentDetailsDTO> getAppointmentDetailsById(int id) {
        return appointmentDetailsCrudRepository.findById(id).map(appointmentDetailsMapper::toAppointmentDetailsDTO);
    }

    @Override
    public AppointmentDetailsDTO save(AppointmentDetailsDTO appointmentDetailsDTO) {
        AppointmentDetails appointmentDetails = appointmentDetailsMapper.toAppointmentDetails(appointmentDetailsDTO);
        return appointmentDetailsMapper.toAppointmentDetailsDTO(appointmentDetailsCrudRepository.save(appointmentDetails));
    }

    @Override
    public void deleteById(int id) {
        appointmentDetailsCrudRepository.deleteById(id);
    }

    @Override
    public long countAll() {
        return appointmentDetailsCrudRepository.count();
    }
}
