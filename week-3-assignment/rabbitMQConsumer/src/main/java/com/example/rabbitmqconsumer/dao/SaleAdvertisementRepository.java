package com.example.rabbitmqconsumer.dao;

import com.example.rabbitmqconsumer.entity.SaleAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleAdvertisementRepository extends JpaRepository<SaleAdvertisement, Long> {
}
