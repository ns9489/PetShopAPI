package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.SupplierDTO;
import com.PetShop.persistence.entity.Supplier;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    @Mappings({
            @Mapping(source = "id", target = "supplierId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "email", target = "email")
    })
    SupplierDTO toSupplierDTO(Supplier supplier);
    List<SupplierDTO> toSupplierDTO(List<Supplier> suppliers);

    @InheritInverseConfiguration
    @Mapping(target = "product" , ignore = true)
    Supplier toSupplier(SupplierDTO supplierDTO);
}
