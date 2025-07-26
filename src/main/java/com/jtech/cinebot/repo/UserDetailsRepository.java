package com.jtech.cinebot.repo;

import com.jtech.cinebot.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
    @Query("SELECT u.userId FROM UserDetails u WHERE u.name = ?1")
    Integer findUserIdByUserName(String userName);
}
