package com.example.a.spring.into.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "colors")
@Entity
@Getter
@Setter
public class Color {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "color")
    private String name;

    @OneToMany(mappedBy = "color")
    private List<Car> cars;
}
