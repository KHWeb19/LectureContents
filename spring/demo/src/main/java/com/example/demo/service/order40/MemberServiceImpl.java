package com.example.demo.service.order40;

import com.example.demo.entity.order36.ProductBoard;
import com.example.demo.entity.order40.Member;
import com.example.demo.repository.order36.ProductBoardRepository;
import com.example.demo.repository.order40.MemberRepository;
import com.example.demo.service.order36.ProductBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository repository;

    @Override
    public void register(Member member) {

    }

    @Override
    public List<Member> list() {
        return null;
    }

    @Override
    public ProductBoard read(Integer memberNo) {
        return null;
    }

    @Override
    public void modify(Member member) {

    }

    @Override
    public void remove(Integer memberNo) {

    }

    @Override
    public Boolean login(Member member) {
        return null;
    }

    /*
    @Override
    public void register(ProductBoard productBoard) {
        repository.create(productBoard);
    }

    @Override
    public List<ProductBoard> list() {
        return repository.list();
    }

    @Override
    public ProductBoard read(Integer productNo) {
        return repository.read(productNo);
    }

    @Override
    public void modify(ProductBoard productBoard) {
        repository.update(productBoard);
    }

    @Override
    public void remove(Integer productNo) {
        repository.delete(productNo);
    }
     */
}
