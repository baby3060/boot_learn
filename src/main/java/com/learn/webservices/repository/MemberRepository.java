package com.learn.webservices.repository;

import java.util.List;

import com.learn.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}