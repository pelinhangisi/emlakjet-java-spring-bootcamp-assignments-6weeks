package com.pelinhangisi.consumer.service;

import com.pelinhangisi.consumer.dao.AdvertisementRepository;
import com.pelinhangisi.consumer.dao.UserRepository;
import com.pelinhangisi.consumer.dto.AdvertisementDto;
import com.pelinhangisi.consumer.entitiy.Advertisement;
import com.pelinhangisi.consumer.entitiy.User;
import com.pelinhangisi.consumer.helper.descriptionHelper;
import com.pelinhangisi.consumer.helper.titleHelper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;


@Service
public class AdvertisementService {

    private AdvertisementRepository advertisementRepository;
    private UserRepository userRepository;

    @Autowired
    public AdvertisementService(AdvertisementRepository advertisementRepository,UserRepository userRepository) {
        this.advertisementRepository = advertisementRepository;
        this.userRepository = userRepository;
    }



    @RabbitListener (queues= "${queue.name}")
    public void createAdvertisement(AdvertisementDto advertisementDto) throws InterruptedException{
        Thread.sleep(60*1000);
        advertisementDto.setDescription(descriptionHelper.generateDescription());
        advertisementDto.setTitle(titleHelper.generateTitle());
        Advertisement advertisement = new Advertisement();
        advertisement.setTitle(advertisementDto.getTitle());
        advertisement.setDescription(advertisementDto.getDescription());
        Random random = new Random();
        Long randomUserId = Long.valueOf(random.nextInt(userRepository.getNumberOfUsers()));
        advertisement.setUser(new User(randomUserId));
        advertisement.setCreatedAt(LocalDateTime.now());
        advertisementRepository.save(advertisement);
    }


    //consumer helperlar yazılıp service içinde kullanıldı
}
