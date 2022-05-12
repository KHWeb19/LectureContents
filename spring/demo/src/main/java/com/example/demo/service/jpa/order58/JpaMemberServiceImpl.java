package com.example.demo.service.jpa.order58;

import com.example.demo.controller.jpa.order58.request.MemberRequest;
import com.example.demo.entity.jpa.VueJpaMemberAuth;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import com.example.demo.repository.jpa.order58.VueJpaMemberAuthRepository;
import com.example.demo.repository.jpa.order58.VueJpaMemberWithAuthRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class JpaMemberServiceImpl implements JpaMemberService {

    @Autowired
    private VueJpaMemberAuthRepository memberAuthRepository;

    @Autowired
    private VueJpaMemberWithAuthRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(MemberRequest memberRequest) {
        String encodedPassword = passwordEncoder.encode(memberRequest.getPw());
        memberRequest.setPw(encodedPassword);

        VueJpaMemberAuth authEntity = new VueJpaMemberAuth(memberRequest.getAuth());
        VueJpaMemberWithAuth memberEntity = new VueJpaMemberWithAuth(
                memberRequest.getId(), memberRequest.getPw());

        memberEntity.addAuth(authEntity);

        memberRepository.save(memberEntity);
    }

    @Override
    public MemberRequest login(MemberRequest memberRequest) {
        Optional<VueJpaMemberWithAuth> maybeMember = memberRepository.findByUserId(memberRequest.getId());

        if (maybeMember == null) {
            log.info("There are no person who has this id!");
            return null;
        }

        VueJpaMemberWithAuth loginMember = maybeMember.get();

        if (!passwordEncoder.matches(memberRequest.getPw(), loginMember.getPassword())) {
            log.info("Entered wrong password!");
            return null;
        }

        Optional<VueJpaMemberAuth> maybeMemberAuth =
                memberAuthRepository.findByMemberNo(loginMember.getMemberNo());

        if (maybeMemberAuth == null) {
            log.info("no auth");
            return null;
        }

        VueJpaMemberAuth memberAuth = maybeMemberAuth.get();
        MemberRequest response = new MemberRequest(
                memberRequest.getId(),
                null,
                memberAuth.getAuth());

        return response;
    }
}
