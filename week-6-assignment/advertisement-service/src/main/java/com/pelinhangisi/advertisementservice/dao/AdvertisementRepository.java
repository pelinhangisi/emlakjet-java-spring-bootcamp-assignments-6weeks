package com.pelinhangisi.advertisementservice.dao;

import com.pelinhangisi.advertisementservice.entity.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {
}
