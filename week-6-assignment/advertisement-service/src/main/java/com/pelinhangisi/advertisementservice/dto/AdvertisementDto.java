package com.pelinhangisi.advertisementservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementDto {

    private String title;
    private BigDecimal price;
    private String detailMessage;
    private Long userId;
}
