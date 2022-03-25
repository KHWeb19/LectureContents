package com.example.demo.repository.jpa.order62;

import com.example.demo.entity.jpa.JpaBoard;
import com.example.demo.entity.jpa.VueJpaMemberAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JpaBoardRepository extends JpaRepository<JpaBoard, Long> {
}
