package com.pelinhangisi.rabbitmqpublisher.service;

import com.pelinhangisi.rabbitmqpublisher.dao.SaleAdvertisementRepository;
import com.pelinhangisi.rabbitmqpublisher.dao.UserRepository;
import com.pelinhangisi.rabbitmqpublisher.dto.SaleAdvertisementDto;
import com.pelinhangisi.rabbitmqpublisher.entity.SaleAdvertisement;
import com.pelinhangisi.rabbitmqpublisher.entity.User;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class SaleAdvertisementServiceImp implements SaleAdvertisementService{
    private SaleAdvertisementRepository saleAdvertisementRepository;
    private UserRepository userRepository;
    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    @Autowired
    public SaleAdvertisementServiceImp(SaleAdvertisementRepository saleAdvertisementRepository, UserRepository userRepository, RabbitTemplate rabbitTemplate, Queue queue) {
        this.saleAdvertisementRepository = saleAdvertisementRepository;
        this.userRepository = userRepository;
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    @Override
    public String createSaleAdvertisement(SaleAdvertisementDto saleAdvertisementDto) {
        User user = User.builder()
                .userName(saleAdvertisementDto.getUserName())
                .email(saleAdvertisementDto.getEmail())
                .build();
        User userDB = userRepository.save(user);

        SaleAdvertisement saleAdvertisement = SaleAdvertisement.builder()
                .title(saleAdvertisementDto.getTitle())
                .photo(saleAdvertisementDto.getPhoto())
                .detailMessage(saleAdvertisementDto.getDetailMessage())
                .build();
        SaleAdvertisement saleAdvertisementDB = saleAdvertisementRepository.save(saleAdvertisement);

        rabbitTemplate.convertAndSend(queue.getName(), saleAdvertisementDB);
        return  "";
    }

    @Override
    public List<SaleAdvertisement> getAll() {
        return saleAdvertisementRepository.findAll();
    }
}
