package com.jtech.cinebot.service;

import com.jtech.cinebot.dto.ActorDto;
import com.jtech.cinebot.dto.MovieDto;
import com.jtech.cinebot.dto.ReviewDto;
import com.jtech.cinebot.dto.UserDetailsDto;
import com.jtech.cinebot.entity.Actor;
import com.jtech.cinebot.entity.Movie;
import com.jtech.cinebot.entity.Review;
import com.jtech.cinebot.entity.UserDetails;
import com.jtech.cinebot.mapper.ActorMapper;
import com.jtech.cinebot.mapper.MovieMapper;
import com.jtech.cinebot.mapper.ReviewMapper;
import com.jtech.cinebot.mapper.UserDetailsMapper;
import com.jtech.cinebot.repo.ActorRepository;
import com.jtech.cinebot.repo.MovieRepository;
import com.jtech.cinebot.repo.ReviewRepository;
import com.jtech.cinebot.repo.UserDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CinebotService {

    @Autowired
    ReviewRepository reviewRepo;

    @Autowired
    ActorRepository actorRepo;

    @Autowired
    MovieRepository movieRepo;

    @Autowired
    UserDetailsRepository userDetailsRepo;

    public void saveUserReview(ReviewDto reviewDto){
        Review review = ReviewMapper.toEntity(reviewDto);

        review.setUserId(userDetailsRepo.findUserIdByUserName(review.getUserName()));
        log.info("User ID found for user: {}", review.getUserName());

        review.setMovieId(movieRepo.findMovieIdByMovieName(review.getMovieName()));
        log.info("Movie ID found for movie: {}", review.getMovieName());

        review.setActorId(actorRepo.findActorIdByActorName(review.getActorName()));
        log.info("Actor ID found for actor: {}", review.getActorName());

        review.setActressId(actorRepo.findActorIdByActorName(review.getActressName()));
        log.info("Actress ID found for actress: {}", review.getActressName());

        reviewRepo.save(review);
        log.info("Review saved successfully for user ID: {}", review.getUserId());
    }

    public void saveActorDetails(ActorDto actorDto) {
        Actor actor = ActorMapper.toEntity(actorDto);
        actorRepo.save(actor);
        log.info("Actor details saved successfully for actor: {}", actor.getName());
    }

    public void saveMovieDetails(MovieDto movieDto) {
        Movie movie = MovieMapper.toEntity(movieDto);
        if(movie.getMovieName() != null) {
            movie.setMovieId(movieRepo.findMovieIdByMovieName(movie.getMovieName()));
            log.info("Movie ID found for movie: {}", movie.getMovieName());
        }
        if(movie.getLeadActorName() != null) {
            movie.setLeadActorId(actorRepo.findActorIdByActorName(movie.getLeadActorName()));
            log.info("Lead Actor ID found for actor: {}", movie.getLeadActorName());
        }
        if(movie.getLeadActressName() != null) {
            movie.setLeadActressId(actorRepo.findActorIdByActorName(movie.getLeadActressName()));
            log.info("Lead Actor ID found for actress: {}", movie.getLeadActressName());
        }
        movieRepo.save(movie);
        log.info("Movie details saved successfully for movie: {}", movie.getMovieName());
    }

    public void saveUserDetails(UserDetailsDto userDetailsDto) {
        UserDetails userDetails = UserDetailsMapper.toEntity(userDetailsDto);
        userDetailsRepo.save(userDetails);
        log.info("User details saved successfully for user ID: {}", userDetails.getUserId());
    }
}
