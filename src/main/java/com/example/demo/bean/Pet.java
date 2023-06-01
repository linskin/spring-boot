package com.example.demo.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Pet {
    private String name;
    private Double weight;
}
