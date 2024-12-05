package com.PetShop.web.controller;

import com.PetShop.domain.dto.AppointmentDetailsDTO;
import com.PetShop.domain.service.AppointmentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointmentDetails")
public class AppointmentDetailsController {

    @Autowired
    private AppointmentDetailsService appointmentDetailsService;

    @GetMapping("/getAll")
    public List<AppointmentDetailsDTO> getAll() {
        return appointmentDetailsService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<AppointmentDetailsDTO> getAppointmentDetailsById(@PathVariable("id") int id) {
        return appointmentDetailsService.getAppointmentDetailsById(id);
    }

    @PostMapping("/save")
    public AppointmentDetailsDTO save(@RequestBody AppointmentDetailsDTO appointmentDetailsDTO) {
        return appointmentDetailsService.save(appointmentDetailsDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return appointmentDetailsService.delete(id);
    }

    @GetMapping("/count")
    public long count() {
        return appointmentDetailsService.countAll();
    }
}
