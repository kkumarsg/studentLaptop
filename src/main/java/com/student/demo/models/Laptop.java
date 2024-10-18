package com.student.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

    @Id
    private Long id;
    private String brand;
    private String name;

    @OneToOne(mappedBy = "laptop")
    private Student student;
}
