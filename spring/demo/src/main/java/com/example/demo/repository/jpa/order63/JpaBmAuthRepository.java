package com.example.demo.repository.jpa.order63;

import com.example.demo.entity.jpa.JpaMemberAuthBoth;
import com.example.demo.entity.jpa.VueJpaMemberAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JpaBmAuthRepository extends JpaRepository<JpaMemberAuthBoth, Long> {
}
