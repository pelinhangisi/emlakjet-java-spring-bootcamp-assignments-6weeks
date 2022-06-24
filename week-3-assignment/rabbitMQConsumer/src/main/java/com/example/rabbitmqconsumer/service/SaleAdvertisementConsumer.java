package com.example.rabbitmqconsumer.service;


import com.example.rabbitmqconsumer.dao.SaleAdvertisementRepository;
import com.example.rabbitmqconsumer.entity.SaleAdvertisement;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class SaleAdvertisementConsumer {
    private SaleAdvertisementRepository saleAdvertisementRepository;

    @Autowired
    public SaleAdvertisementConsumer(SaleAdvertisementRepository saleAdvertisementRepository) {
        this.saleAdvertisementRepository = saleAdvertisementRepository;
    }

    @RabbitListener(queues = {"${queue.name}"})
    public void listen(@Payload SaleAdvertisement saleAdvertisement) throws InterruptedException {
        Thread.sleep(3*1000);
        saleAdvertisement.setPriceGraphPath("updated");
        saleAdvertisementRepository.save(saleAdvertisement);



    }
}
