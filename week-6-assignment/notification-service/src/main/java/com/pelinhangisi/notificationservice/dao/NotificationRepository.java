package com.pelinhangisi.notificationservice.dao;

import com.pelinhangisi.notificationservice.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
