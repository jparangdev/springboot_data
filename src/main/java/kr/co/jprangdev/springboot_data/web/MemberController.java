package kr.co.jprangdev.springboot_data.web;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jprangdev.springboot_data.entity.MemberEntity;
import kr.co.jprangdev.springboot_data.service.MemberService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@PostMapping
	public Long create(@RequestBody MemberEntity member) {
		return memberService.persist(member);
	}

	@PostMapping
	public List<Long> createAll(@RequestBody List<MemberEntity> list) {
		return memberService.createAll(list);
	}
}
