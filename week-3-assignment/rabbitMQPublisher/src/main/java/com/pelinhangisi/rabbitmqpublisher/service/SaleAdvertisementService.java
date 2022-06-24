package com.pelinhangisi.rabbitmqpublisher.service;

import com.pelinhangisi.rabbitmqpublisher.dto.SaleAdvertisementDto;
import com.pelinhangisi.rabbitmqpublisher.entity.SaleAdvertisement;

import java.util.List;


public interface SaleAdvertisementService {
    String createSaleAdvertisement(SaleAdvertisementDto saleAdvertisementDto);
    List<SaleAdvertisement> getAll();
}
