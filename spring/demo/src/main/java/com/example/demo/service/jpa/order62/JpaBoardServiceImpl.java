package com.example.demo.service.jpa.order62;

import com.example.demo.entity.jpa.JpaBoard;
import com.example.demo.entity.order32.Board;
import com.example.demo.repository.jpa.order62.JpaBoardRepository;
import com.example.demo.repository.order32.BoardRepository;
import com.example.demo.service.order32.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaBoardServiceImpl implements JpaBoardService {

    @Autowired
    JpaBoardRepository repository;

    @Override
    public void register(JpaBoard board) {
        repository.save(board);
    }

    @Override
    public List<JpaBoard> list() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
    }

    @Override
    public JpaBoard read(Integer boardNo) {
        return repository.getById(Long.valueOf(boardNo));
    }

    @Override
    public void modify(JpaBoard board) {
        repository.save(board);
    }

    @Override
    public void remove(Integer boardNo) {
        repository.deleteById(Long.valueOf(boardNo));
    }
}
