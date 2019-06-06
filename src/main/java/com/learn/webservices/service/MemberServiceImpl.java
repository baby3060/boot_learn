package com.learn.webservices.service;

import java.util.*;
import com.learn.domain.Member;
import com.learn.webservices.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void addMember(Member newMember) {
        memberRepository.saveAndFlush(newMember);
    }

    public List<Member> findAll() {
        return new ArrayList<Member>();
    }

    public long countAll() {
        return memberRepository.count();
    }
}