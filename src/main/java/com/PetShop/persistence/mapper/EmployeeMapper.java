package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.EmployeeDTO;
import com.PetShop.persistence.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mappings({
            @Mapping(source = "id", target = "employeeId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "email", target = "email")
    })
    EmployeeDTO toEmployeeDTO(Employee employee);
    List<EmployeeDTO> toEmployeeDTO(List<Employee> employees);

    @InheritInverseConfiguration
    @Mapping(target = "invoice", ignore = true)
    Employee toEmployee(EmployeeDTO employeeDTO);
}
