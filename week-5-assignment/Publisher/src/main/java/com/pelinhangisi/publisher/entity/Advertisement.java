package com.pelinhangisi.publisher.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "advertisements")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

   @Column(name ="title")
   private String title;

   @Column(name="description")
   private String description;

   @Column(name="created_at")
   private LocalDateTime createdAt;


   @ManyToOne
   @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
