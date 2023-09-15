package com.example.taskspring.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductModel {

    private Long id;
    private String name;
    private double price;
}
