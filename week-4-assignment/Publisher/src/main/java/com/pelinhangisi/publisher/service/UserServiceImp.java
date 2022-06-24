package com.pelinhangisi.publisher.service;


import com.pelinhangisi.publisher.dto.UserDto;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    private RabbitTemplate rabbitTemplate;

    private Queue queue;

    @Autowired
    public UserServiceImp(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    // 50 adet mesaj gönderimi için oluşturulan algoritma
    @Override
    public void createUser(UserDto userDto) {
        int i = 1;
        while(i<=50) {
            rabbitTemplate.convertAndSend(this.queue.getName(), userDto);
            i++;
        }
    }
}
