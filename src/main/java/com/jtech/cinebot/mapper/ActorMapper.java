package com.jtech.cinebot.mapper;

import com.jtech.cinebot.dto.ActorDto;
import com.jtech.cinebot.entity.Actor;

public class ActorMapper {
    public static Actor toEntity(ActorDto actorDto) {
        return Actor.builder()
                .name(actorDto.getName())
                .age(actorDto.getAge())
                .gender(actorDto.getGender())
                .build();
    }
}
