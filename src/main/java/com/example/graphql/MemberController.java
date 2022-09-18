package com.example.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {
	private final MemberService memberService;
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@QueryMapping
	public List<Member> getMemberAll() {
		return memberService.member();
	}

	@MutationMapping
	public Member SaveMemberInfo(@Argument Member saveMemberInfo) {
		return memberService.saveMember(saveMemberInfo);
	}
	
}
