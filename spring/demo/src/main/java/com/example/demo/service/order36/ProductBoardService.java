package com.example.demo.service.order36;

import com.example.demo.entity.order36.ProductBoard;

import java.util.List;

public interface ProductBoardService {
    public void register (ProductBoard productBoard);
    public List<ProductBoard> list ();
    public ProductBoard read (Integer productNo);
    public void modify (ProductBoard productBoard);
    public void remove (Integer productNo);
}
