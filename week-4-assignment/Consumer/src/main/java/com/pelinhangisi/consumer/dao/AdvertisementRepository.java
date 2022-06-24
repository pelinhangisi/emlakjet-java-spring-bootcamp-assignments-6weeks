package com.pelinhangisi.consumer.dao;

import com.pelinhangisi.consumer.entitiy.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {
}
