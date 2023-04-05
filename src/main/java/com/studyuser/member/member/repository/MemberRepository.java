package com.studyuser.member.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyuser.member.member.repository.entity.Member;

//public class MemberRepository {

public interface MemberRepository extends JpaRepository<Member, Long> {

}
