package com.example.demo.service.jpa.order63;

import com.example.demo.controller.jpa.order58.request.MemberRequest;
import com.example.demo.entity.jpa.JpaMemberAuthBoth;
import com.example.demo.entity.jpa.JpaMemberBoth;
import com.example.demo.entity.jpa.VueJpaMemberAuth;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import com.example.demo.repository.jpa.order58.VueJpaMemberAuthRepository;
import com.example.demo.repository.jpa.order58.VueJpaMemberWithAuthRepository;
import com.example.demo.repository.jpa.order63.JpaBmAuthRepository;
import com.example.demo.repository.jpa.order63.JpaBmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class JpaBmServiceImpl implements JpaBmService {

    @Autowired
    private JpaBmRepository memberRepository;

    @Autowired
    private JpaBmAuthRepository memberAuthRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public void register(MemberRequest memberRequest) {
        String encodedPassword = passwordEncoder.encode(memberRequest.getPw());
        memberRequest.setPw(encodedPassword);

        JpaMemberBoth memberEntity = new JpaMemberBoth(
                memberRequest.getId(), memberRequest.getPw());

        memberRepository.save(memberEntity);

        JpaMemberAuthBoth authEntity = new JpaMemberAuthBoth(memberRequest.getAuth(), memberEntity);

        memberAuthRepository.save(authEntity);
    }

    @Override
    public List<JpaMemberBoth> findBusiness() {
        List<JpaMemberBoth> businessMember = memberRepository.selectMemberWithRole("사업자");
        return null;
    }
}
