package com.jtech.cinebot.mapper;

import com.jtech.cinebot.dto.MovieDto;
import com.jtech.cinebot.entity.Movie;

public class MovieMapper {
    public static Movie toEntity(MovieDto movieDto) {
        return Movie.builder()
                .movieName(movieDto.getMovieName())
                .movieGenre(movieDto.getMovieGenre())
                .yearOfRelease(movieDto.getYearOfRelease())
                .build();
    }
}
