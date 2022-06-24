package com.pelinhangisi.rabbitmqpublisher.controller;

import com.pelinhangisi.rabbitmqpublisher.dto.SaleAdvertisementDto;
import com.pelinhangisi.rabbitmqpublisher.entity.SaleAdvertisement;
import com.pelinhangisi.rabbitmqpublisher.service.SaleAdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SaleAdvertisementController {

    private SaleAdvertisementService saleAdvertisementService;

    @Autowired
    public SaleAdvertisementController(SaleAdvertisementService saleAdvertisementService) {
        this.saleAdvertisementService = saleAdvertisementService;
    }

    @PostMapping("/sale-advertisement")
    public String  createSaleAdvertisement(@RequestBody SaleAdvertisementDto saleAdvertisementDto){
        saleAdvertisementService.createSaleAdvertisement(saleAdvertisementDto);
        return "Talebiniz alınmıştır.";
    }

    public List<SaleAdvertisement> getAll(){
        return saleAdvertisementService.getAll();
    }
}
