package com.example.demo.service.order36;

import com.example.demo.entity.order32.Board;
import com.example.demo.entity.order36.ProductBoard;
import com.example.demo.repository.order32.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBoardServiceImpl implements ProductBoardService {

    @Autowired
    ProductBoardRepository repository;

    @Override
    public void register(ProductBoard productBoard) {

    }

    @Override
    public List<ProductBoard> list() {
        return null;
    }

    @Override
    public ProductBoard read(Integer productNo) {
        return null;
    }

    @Override
    public void modify(ProductBoard board) {

    }

    @Override
    public void remove(Integer productNo) {

    }
}
