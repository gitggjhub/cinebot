package com.jtech.cinebot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "review", schema = "cinebot_data")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    private String userName;
    private Integer userId;
    private String movieName;
    private Integer movieId;
    private LocalDateTime dateWatchedByUser;
    private Float movieRating;
    private String commentsOnMovie;
    private String commentsOnLeadActor;
    private String commentsOnLeadActress;
    private String actorName;
    private String actressName;
    private Integer actorId;
    private Integer actressId;
}
