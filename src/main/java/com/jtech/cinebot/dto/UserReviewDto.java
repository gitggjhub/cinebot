package com.jtech.cinebot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReviewDto {
    private UserDetailsDto userDetailsDto;
    private MovieDto movieDto;
    private ActorDto actorDto;
    private ReviewDto reviewDto;
}
