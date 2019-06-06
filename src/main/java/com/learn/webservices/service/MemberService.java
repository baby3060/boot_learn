package com.learn.webservices.service;

import java.util.*;
import com.learn.domain.Member;

public interface MemberService {
    void addMember(Member newMember);
    List<Member> findAll();
    long countAll();
}