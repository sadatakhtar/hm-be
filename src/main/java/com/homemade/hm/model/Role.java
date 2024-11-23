package com.homemade.hm.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    // No-argument constructor
    public Role() {
    }

    public Role(Object o, String name) {
        this.name = name;
    }

}
