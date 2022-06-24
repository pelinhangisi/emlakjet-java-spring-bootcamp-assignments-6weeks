package com.pelinhangisi.rabbitmqpublisher.dao;

import com.pelinhangisi.rabbitmqpublisher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
