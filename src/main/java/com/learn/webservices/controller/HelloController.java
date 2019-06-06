package com.learn.webservices.controller;

import com.learn.domain.Member;
import com.learn.webservices.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String hello() {
        Member newMember = new Member("김길동", "부산", 14);
        memberService.addMember(newMember);

        return "Hello Rest Boot " + memberService.countAll();
    }
    
}