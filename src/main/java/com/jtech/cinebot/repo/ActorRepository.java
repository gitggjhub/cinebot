package com.jtech.cinebot.repo;

import com.jtech.cinebot.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
    @Query("SELECT a.actorId FROM Actor a WHERE a.name = :name")
    Integer findActorIdByActorName(@Param("name") String name);

}
