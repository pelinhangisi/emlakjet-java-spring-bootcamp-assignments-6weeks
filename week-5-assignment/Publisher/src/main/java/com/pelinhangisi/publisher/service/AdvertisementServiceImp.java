package com.pelinhangisi.publisher.service;

import com.pelinhangisi.publisher.dao.AdvertisementRepository;
import com.pelinhangisi.publisher.dto.AdvertisementDto;
import com.pelinhangisi.publisher.entity.Advertisement;
import org.apache.tomcat.jni.Local;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class AdvertisementServiceImp implements AdvertisementService {
    private AdvertisementRepository advertisementRepository;
    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    @Autowired
    public AdvertisementServiceImp(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    @Override
    public void createAdvertisement(AdvertisementDto advertisementDto) {
        int i = 1;
        while (i <= 50) {
            rabbitTemplate.convertAndSend(this.queue.getName(), advertisementDto);
            i++;
        }
    }

    @Override
    public List<Advertisement> findAdvertisementByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return advertisementRepository.findAdvertisementByCreatedAtBetween(startDate,endDate);
    }

    @Override
    public List<Advertisement> findAdvertisementByCreatedAtOrderByCreatedAtAsc(LocalDateTime time) {
        return advertisementRepository.findAdvertisementByCreatedAtOrderByCreatedAtAsc(time);
    }

    @Override
    public List<Advertisement> findAdvertisementByCreatedAtOrderByCreatedAtDesc(LocalDateTime time) {
        return advertisementRepository.findAdvertisementByCreatedAtOrderByCreatedAtDesc(time);
    }

    @Override
    public List<Advertisement> findAdvertisementByTitleContainingIgnoreCase(String title) {
        return advertisementRepository.findAdvertisementByTitleContainingIgnoreCase(title);
    }

    @Override
    public List<Advertisement> findAdvertisementByDescriptionContainingIgnoreCase(String description) {
        return advertisementRepository.findAdvertisementByDescriptionContainingIgnoreCase(description);
    }
}
