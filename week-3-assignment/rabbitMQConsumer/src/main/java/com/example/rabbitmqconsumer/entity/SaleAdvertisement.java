package com.example.rabbitmqconsumer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "saleAdvertisement")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleAdvertisement {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "photo")
    private String photo;

    @Column(name = "detail_message")
    private String detailMessage;

    @Column(name = "price_graph_path")
    private String priceGraphPath;


}
