package com.PetShop.web.controller;

import com.PetShop.domain.dto.MedicalHistoryDTO;
import com.PetShop.domain.service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicalHistories")
public class MedicalHistoryController {

    @Autowired
    private MedicalHistoryService medicalHistoryService;

    @GetMapping("/getAll")
    public List<MedicalHistoryDTO> getAll() {
        return medicalHistoryService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<MedicalHistoryDTO> getMedicalHistoryById(@PathVariable("id") int id) {
        return medicalHistoryService.getMedicalHistoryById(id);
    }

    @PostMapping("/save")
    public MedicalHistoryDTO save(@RequestBody MedicalHistoryDTO medicalHistoryDTO) {
        return medicalHistoryService.save(medicalHistoryDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return medicalHistoryService.delete(id);
    }

    @GetMapping("/existsMedicalHistory/{id}")
    public boolean existsMedicalHistory(@PathVariable("id") int id) {
        return medicalHistoryService.existsMedicalHistory(id);
    }

    @GetMapping("/countMedicalHistories")
    public long countMedicalHistories() {
        return medicalHistoryService.countAll();
    }
}
