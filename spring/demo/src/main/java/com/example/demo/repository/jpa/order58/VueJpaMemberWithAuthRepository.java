package com.example.demo.repository.jpa.order58;

import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VueJpaMemberWithAuthRepository extends JpaRepository<VueJpaMemberWithAuth, Long> {

    @Query("select m from VueJpaMemberWithAuth m where m.userId = :userId")
    Optional<VueJpaMemberWithAuth> findByUserId(String userId);
}
