package com.PetShop.web.controller;

import com.PetShop.domain.dto.EmployeeDTO;
import com.PetShop.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<EmployeeDTO> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<EmployeeDTO> getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/save")
    public EmployeeDTO save(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.save(employeeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return employeeService.delete(id);
    }

    @GetMapping("/existsEmployee/{id}")
    public boolean existsEmployee(@PathVariable("id") int id) {
        return employeeService.existsEmployee(id);
    }

    @GetMapping("/countEmployees")
    public long countEmployees() {
        return employeeService.countAll();
    }
}
