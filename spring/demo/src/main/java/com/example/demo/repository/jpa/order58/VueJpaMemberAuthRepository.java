package com.example.demo.repository.jpa.order58;

import com.example.demo.entity.jpa.VueJpaMemberAuth;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VueJpaMemberAuthRepository extends JpaRepository<VueJpaMemberAuth, Long> {

    @Query("select ma.auth from VueJpaMemberAuth ma where ma.memberNo = :memberNo")
    Optional<VueJpaMemberAuth> findByMemberNo(Long memberNo);
}
