package com.jtech.cinebot.repo;

import com.jtech.cinebot.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query("SELECT m.movieId FROM Movie m WHERE m.movieName = :movieName")
    Integer findMovieIdByMovieName(@Param("movieName") String movieName);
}
