package com.jtech.cinebot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "movie", schema = "cinebot_data")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;
    private String movieName;
    private String movieGenre;
    private String language;
    private String countryOfOrigin;
    private String movieIndustry;
    private Integer yearOfRelease;
    private String leadActorName;
    private String leadActressName;
    private Integer leadActorId;
    private Integer leadActressId;
}
