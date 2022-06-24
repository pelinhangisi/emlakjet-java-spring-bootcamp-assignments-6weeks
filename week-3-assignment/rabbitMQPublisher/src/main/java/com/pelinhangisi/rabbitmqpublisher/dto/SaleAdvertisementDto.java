package com.pelinhangisi.rabbitmqpublisher.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SaleAdvertisementDto implements Serializable {

    private String title;

    private String photo;

    private String detailMessage;

    private String userName;

    private String email;
}
