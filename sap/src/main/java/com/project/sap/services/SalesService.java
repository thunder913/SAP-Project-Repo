package com.project.sap.services;

import com.project.sap.models.Dto.SaleDto;
import com.project.sap.models.Sale;

import java.util.List;

public interface SalesService {
    List<Sale> getAll();

    Sale convertDtoToSale(SaleDto saleDto);

    SaleDto convertSaleToDto(Sale sale);

    void save(Sale sale);

    void deleteById(long id);

    Sale getById(long id);
}
