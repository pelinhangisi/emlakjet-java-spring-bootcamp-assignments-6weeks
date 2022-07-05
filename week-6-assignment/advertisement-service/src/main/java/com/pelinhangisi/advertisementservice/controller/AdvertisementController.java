package com.pelinhangisi.advertisementservice.controller;

import com.pelinhangisi.advertisementservice.dto.AdvertisementDto;
import com.pelinhangisi.advertisementservice.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advertisement")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @PostMapping
    public String createAdvertisement(@RequestBody AdvertisementDto advertisementDto){
        advertisementService.createAdvertisement(advertisementDto);
        return "Talebiniz alınmıştır.";
    }

}

