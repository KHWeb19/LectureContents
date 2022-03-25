package com.example.demo.service.jpa.order62;

import com.example.demo.entity.jpa.JpaBoard;
import com.example.demo.entity.order32.Board;

import java.util.List;

public interface JpaBoardService {
    public void register (JpaBoard board);
    public List<JpaBoard> list ();
    public JpaBoard read (Integer boardNo);
    public void modify (JpaBoard board);
    public void remove (Integer boardNo);
}
