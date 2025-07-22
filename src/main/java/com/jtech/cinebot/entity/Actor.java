package com.jtech.cinebot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "actor", schema = "cinebot_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actorId;
    private String name;
    private Boolean gender;
    private Integer age;
}
