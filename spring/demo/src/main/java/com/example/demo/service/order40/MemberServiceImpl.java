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
        repository.create(member);
    }

    @Override
    public List<Member> list() {
        return repository.list();
    }

    @Override
    public Member read(Integer memberNo) {
        return repository.read(memberNo);
    }

    @Override
    public void modify(Member member) {
        repository.update(member);
    }

    @Override
    public void remove(Integer memberNo) {
        repository.delete(memberNo);
    }

    @Override
    public Boolean login(Member member) {
        // 특정 id 값을 가지고 있는지 검사
        // 해당 id 값의 pw가 일치하는지 확인
        // 모두 OK라면 true 리턴
        // 도중에 하나라도 문제가 발생한다면 false 리턴
        Member findMember = repository.findMemberById(member);

        if (findMember == null) {
            System.out.printf("There are no %s id\n", member.getId());
            return false;
        }

        System.out.println("Check Password Only: " + findMember);
        Boolean loginSuccess = findMember.getPw().equals(member.getPw());

        return loginSuccess;
    }
}
