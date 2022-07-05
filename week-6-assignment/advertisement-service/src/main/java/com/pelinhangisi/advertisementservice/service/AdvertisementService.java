package com.pelinhangisi.advertisementservice.service;

import com.pelinhangisi.advertisementservice.dao.AdvertisementRepository;
import com.pelinhangisi.advertisementservice.dto.AdvertisementDto;
import com.pelinhangisi.advertisementservice.entity.Advertisement;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;
    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;


    public void createAdvertisement(AdvertisementDto advertisementDto){
        Advertisement advertisement = new Advertisement();
        advertisement.setDetailMessage(advertisementDto.getDetailMessage());
        advertisement.setUserId(advertisementDto.getUserId());
        advertisement.setCreatedAt(LocalDateTime.now());
        advertisement.setPrice(advertisementDto.getPrice());
        advertisement.setTitle(advertisementDto.getTitle());
        advertisementRepository.save(advertisement);

        rabbitTemplate.convertAndSend(queue.getName(), advertisementDto);

    }
}
