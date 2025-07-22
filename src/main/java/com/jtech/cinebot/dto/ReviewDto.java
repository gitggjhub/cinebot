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
public class ReviewDto {

    private Integer userId;
    private Integer movieId;
    private LocalDateTime dateWatchedByUser;
    private Float movieRating;
    private String commentsOnMovie;
    private String commentsOnLeadActor;
    private String commentsOnLeadActress;
    private ActorDto actor;
    private ActorDto actress;
}
