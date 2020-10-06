package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;

@Entity
@Data
@Table(name = "MyCar")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mark;
    private String model;
    @Enumerated(EnumType.STRING)
    private Color color;

    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }
}
