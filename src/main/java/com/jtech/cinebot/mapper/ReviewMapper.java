package com.jtech.cinebot.mapper;

import com.jtech.cinebot.dto.ReviewDto;
import com.jtech.cinebot.entity.Review;

public class ReviewMapper {
    public static Review toEntity(ReviewDto reviewDto) {
        return Review.builder()
                .userName(reviewDto.getUserName())
                .movieName(reviewDto.getMovieName())
                .dateWatchedByUser(reviewDto.getDateWatchedByUser())
                .movieRating(reviewDto.getMovieRating())
                .commentsOnMovie(reviewDto.getCommentsOnMovie())
                .commentsOnLeadActor(reviewDto.getCommentsOnLeadActor())
                .commentsOnLeadActress(reviewDto.getCommentsOnLeadActress())
                .actorName(reviewDto.getActorName())
                .actressName(reviewDto.getActressName())
                .build();
    }
}
