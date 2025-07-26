package com.jtech.cinebot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDto {

    private String movieName;
    private String movieGenre;
    private Integer yearOfRelease;
    private String language;
    private String countryOfOrigin;
    private String movieIndustry;
    private String leadActorName;
    private String leadActressName;
}
