package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.InvoiceDTO;
import com.PetShop.persistence.entity.Invoice;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EmployeeMapper.class, MedicalAppointmentMapper.class})
public interface InvoiceMapper {
    @Mappings({
            @Mapping(source = "id" , target = "invoiceId"),
            @Mapping(source = "date" , target = "date"),
            @Mapping(source = "time" , target = "time"),
            @Mapping(source = "totalAmount" , target = "totalAmount"),
            @Mapping(source = "totalReceived" , target = "totalReceived"),
            @Mapping(source = "totalReturn" , target = "totalReturn"),
            @Mapping(source = "employee" , target = "employee"),
            @Mapping(source = "medicalAppointment" , target = "medicalAppointment")
    })
    InvoiceDTO toInvoiceDTO(Invoice invoice);
    List<InvoiceDTO> toInvoiceDTO(List<Invoice> invoices);

    @InheritInverseConfiguration
    @Mapping(target = "invoiceDetail", ignore = true)
    Invoice toInvoice(InvoiceDTO invoiceDTO);
}
