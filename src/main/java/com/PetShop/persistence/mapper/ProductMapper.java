package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.ProductDTO;
import com.PetShop.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SupplierMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "category", target = "category"),
            @Mapping(source = "brand", target = "brand"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "supplier", target = "supplier")
    })
    ProductDTO toProductDTO(Product product);
    List<ProductDTO> toProductDTO(List<Product> productList);

    @InheritInverseConfiguration
    @Mapping(target = "invoiceDetail" , ignore = true)
    Product toProduct(ProductDTO productDTO);
}
