package com.pelinhangisi.rabbitmqpublisher.dao;

import com.pelinhangisi.rabbitmqpublisher.entity.SaleAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleAdvertisementRepository extends JpaRepository<SaleAdvertisement, Long> {
}
