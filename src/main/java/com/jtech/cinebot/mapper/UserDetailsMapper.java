package com.jtech.cinebot.mapper;

import com.jtech.cinebot.dto.UserDetailsDto;
import com.jtech.cinebot.entity.UserDetails;

public class UserDetailsMapper {
    public static UserDetails toEntity(UserDetailsDto userDetailsDto) {
        return UserDetails.builder()
                .name(userDetailsDto.getName())
                .email(userDetailsDto.getEmail())
                .age(userDetailsDto.getAge())
                .gender(userDetailsDto.getGender())
                .build();
    }
}
