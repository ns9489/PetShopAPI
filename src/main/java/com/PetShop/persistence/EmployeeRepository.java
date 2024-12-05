package com.PetShop.persistence;

import com.PetShop.domain.dto.EmployeeDTO;
import com.PetShop.domain.repository.EmployeeDomainRepository;
import com.PetShop.persistence.crud.EmployeeCrudRepository;
import com.PetShop.persistence.entity.Employee;
import com.PetShop.persistence.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository implements EmployeeDomainRepository {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;

    @Override
    public List<EmployeeDTO> getAll(){
        List<Employee> employees = (List<Employee>) employeeCrudRepository.findAll();
        return employeeMapper.toEmployeeDTO(employees);
    }

    @Override
    public Optional<EmployeeDTO> getEmployeeById(int id) {
        return employeeCrudRepository.findById(id).map(employeeMapper::toEmployeeDTO);
    }

    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO){
        Employee employee = employeeMapper.toEmployee(employeeDTO);
        return employeeMapper.toEmployeeDTO(employeeCrudRepository.save(employee));
    }

    @Override
    public void deleteById(int id){
        employeeCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsEmployeeById(int id){
        return employeeCrudRepository.existsById(id);
    }

    @Override
    public long countAll(){
        return employeeCrudRepository.count();
    }
}
