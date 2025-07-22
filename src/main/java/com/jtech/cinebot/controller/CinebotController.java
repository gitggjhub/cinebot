package com.jtech.cinebot.controller;

import com.jtech.cinebot.dto.UserReviewDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/cinebot")
public class CinebotController {
    @PostMapping("/saveReview")
    public ResponseEntity<String> createReview(UserReviewDto userReviewDto) {
        try{
            return new ResponseEntity<>("Review saved successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
