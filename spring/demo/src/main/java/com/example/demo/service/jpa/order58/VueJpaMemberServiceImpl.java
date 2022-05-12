package com.example.demo.service.jpa.order58;

import com.example.demo.entity.jpa.VueJpaMember;
import com.example.demo.repository.jpa.order58.VueJpaMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueJpaMemberServiceImpl implements VueJpaMemberService {

    @Autowired
    private VueJpaMemberRepository repository;

    @Override
    public void register(VueJpaMember member) {
        repository.save(member);
    }
}
