package com.example.demo.service.jpa.order58;

import com.example.demo.controller.jpa.order58.request.MemberRequest;

public interface JpaMemberService {
    public void register (MemberRequest memberRequest);

    public MemberRequest login (MemberRequest memberRequest);
}
