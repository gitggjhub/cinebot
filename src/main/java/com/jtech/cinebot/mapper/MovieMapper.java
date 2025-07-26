package com.jtech.cinebot.mapper;

import com.jtech.cinebot.dto.MovieDto;
import com.jtech.cinebot.entity.Movie;

public class MovieMapper {
    public static Movie toEntity(MovieDto movieDto) {
        return Movie.builder()
                .movieName(movieDto.getMovieName())
                .movieGenre(movieDto.getMovieGenre())
                .yearOfRelease(movieDto.getYearOfRelease())
                .language(movieDto.getLanguage())
                .countryOfOrigin(movieDto.getCountryOfOrigin())
                .movieIndustry(movieDto.getMovieIndustry())
                .leadActorName(movieDto.getLeadActorName())
                .leadActressName(movieDto.getLeadActressName())
                .build();
    }
}
