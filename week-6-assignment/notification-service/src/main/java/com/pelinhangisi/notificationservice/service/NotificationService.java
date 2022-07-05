package com.pelinhangisi.notificationservice.service;

import com.pelinhangisi.notificationservice.dao.NotificationRepository;
import com.pelinhangisi.notificationservice.dto.AdvertisementDto;
import com.pelinhangisi.notificationservice.entity.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {

    private final NotificationRepository notificationRepository;


    @RabbitListener(queues = "${queue.name}")
    public void consume(@Payload AdvertisementDto advertisementDto){
        Notification notification = new Notification();
        notification.setCreatedAt(LocalDateTime.now());
        notification.setUserId(advertisementDto.getUserId());
        notification.setMessage(advertisementDto.getDetailMessage());
        notification.setState("SENT");
        log.info("Notification gönderildi.");
        notificationRepository.save(notification);
    }
}
