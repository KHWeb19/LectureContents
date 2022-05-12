package com.example.demo.repository.jpa.order63;

import com.example.demo.entity.jpa.JpaMemberBoth;
import com.example.demo.entity.jpa.VueJpaMember;
import com.example.demo.entity.jpa.VueJpaMemberWithAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JpaBmRepository extends JpaRepository<JpaMemberBoth, Long> {

    @Transactional
    //@Query(value = "select * from jpa_member where member_no in (select many_to_many_member_no from tbl_many_to_many_member_auth where auth = :auth)", nativeQuery = true)
    @Query(value = "select * from jpa_member_both where member_no in (select jpa_member_both_member_no from jpa_member_auth_both where auth = :auth)", nativeQuery = true)
    public List<JpaMemberBoth> selectMemberWithRole(String auth);
}
