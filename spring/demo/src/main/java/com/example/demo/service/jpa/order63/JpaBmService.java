package com.example.demo.service.jpa.order63;

import com.example.demo.controller.jpa.order58.request.MemberRequest;
import com.example.demo.entity.jpa.JpaMemberBoth;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;

import java.util.List;

public interface JpaBmService {
    public void register (MemberRequest memberRequest);
    List<JpaMemberBoth> findBusiness ();
}
