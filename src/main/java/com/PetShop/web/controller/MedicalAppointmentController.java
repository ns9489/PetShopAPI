package com.PetShop.web.controller;

import com.PetShop.domain.dto.MedicalAppointmentDTO;
import com.PetShop.domain.service.MedicalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicalAppointments")
public class MedicalAppointmentController {

    @Autowired
    private MedicalAppointmentService medicalAppointmentService;

    @GetMapping("/getAll")
    public List<MedicalAppointmentDTO> getAll() {
        return medicalAppointmentService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<MedicalAppointmentDTO> getMedicalAppointmentById(@PathVariable("id") int id) {
        return medicalAppointmentService.getMedicalAppointmentById(id);
    }

    @PostMapping("/save")
    public MedicalAppointmentDTO save(@RequestBody MedicalAppointmentDTO medicalAppointmentDTO) {
        return medicalAppointmentService.save(medicalAppointmentDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return medicalAppointmentService.delete(id);
    }

    @GetMapping("/existsMedicalAppointment/{id}")
    public boolean existsMedicalAppointment(@PathVariable("id") int id) {
        return medicalAppointmentService.existsMedicalAppointment(id);
    }

    @GetMapping("/countMedicalAppointments")
    public long countMedicalAppointments() {
        return medicalAppointmentService.countAll();
    }
}
