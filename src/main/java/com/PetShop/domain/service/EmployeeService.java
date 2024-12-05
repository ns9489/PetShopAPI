package com.PetShop.domain.service;

import com.PetShop.domain.dto.EmployeeDTO;
import com.PetShop.domain.repository.EmployeeDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDomainRepository employeeDomainRepository;

    public List<EmployeeDTO> getAll() {
        return employeeDomainRepository.getAll();
    }

    public Optional<EmployeeDTO> getEmployeeById(int id) {
        return employeeDomainRepository.getEmployeeById(id);
    }

    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        return employeeDomainRepository.save(employeeDTO);
    }

    public boolean delete(int id) {
        return getEmployeeById(id).map(employee -> {
            employeeDomainRepository.deleteById(id);
            return true;
        }).orElse(false);
    }

    public boolean existsEmployee(int id) {
        return employeeDomainRepository.existsEmployeeById(id);
    }

    public long countAll() {
        return employeeDomainRepository.countAll();
    }
}
