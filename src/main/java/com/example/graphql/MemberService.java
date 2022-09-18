package com.example.graphql;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
	private final MemberRepository memberRepository;
	public MemberService (MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	public Member memberById (final Long id) {
		return memberRepository.findById(id).orElse(new Member());
	}

	public List<Member> member () {
		return memberRepository.findAll();
	}

	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}



}
