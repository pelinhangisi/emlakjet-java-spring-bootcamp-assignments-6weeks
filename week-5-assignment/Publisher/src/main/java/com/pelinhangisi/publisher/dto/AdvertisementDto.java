package com.pelinhangisi.publisher.dto;



import lombok.Data;

import java.io.Serializable;

@Data
public class AdvertisementDto implements Serializable {
    private String title;
    private String description;

}
