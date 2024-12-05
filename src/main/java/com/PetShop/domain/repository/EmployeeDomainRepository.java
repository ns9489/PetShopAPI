package com.PetShop.domain.repository;

import com.PetShop.domain.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeDomainRepository {
    List<EmployeeDTO> getAll();
    Optional<EmployeeDTO> getEmployeeById(int id);
    EmployeeDTO save(EmployeeDTO employeeDTO);
    void deleteById(int id);
    boolean existsEmployeeById(int id);
    long countAll();
}
