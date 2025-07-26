package com.jtech.cinebot.controller;

import com.jtech.cinebot.dto.*;
import com.jtech.cinebot.service.CinebotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/cinebot")
public class CinebotController {

    @Autowired
    CinebotService cinebotService;

    @PostMapping("/saveReview")
    public ResponseEntity<String> createReview(@RequestBody ReviewDto reviewDto) {
        try {
            cinebotService.saveUserReview(reviewDto);
            log.info("Review creation request processed successfully.");
            return new ResponseEntity<>("Review saved successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error saving review: {}", e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/saveActor")
    public ResponseEntity<String> createActor(@RequestBody ActorDto actorDto) {
        try {
            cinebotService.saveActorDetails(actorDto);
            log.info("Actor creation request processed successfully.");
            return new ResponseEntity<>("Actor saved successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error saving actor: {}", e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/saveMovie")
    public ResponseEntity<String> createMovie(@RequestBody MovieDto movieDto) {
        try {
            cinebotService.saveMovieDetails(movieDto);
            log.info("Movie creation request processed successfully.");
            return new ResponseEntity<>("Movie saved successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error saving movie: {}", e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/saveUser")
    public ResponseEntity<String> createUser(@RequestBody UserDetailsDto userDetailsDto) {
        try {
            cinebotService.saveUserDetails(userDetailsDto);
            log.info("User creation request processed successfully.");
            return new ResponseEntity<>("User saved successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Error saving user: {}", e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
