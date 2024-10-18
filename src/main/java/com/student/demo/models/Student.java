package com.student.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    @Id
    private Long id;

    private String name;
    private String psp;

    @OneToOne
    private Laptop laptop;

}
