package kr.co.jprangdev.springboot_data.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.co.jprangdev.springboot_data.entity.MemberEntity;
import kr.co.jprangdev.springboot_data.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
	private final MemberRepository memberRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Long persist(MemberEntity memberEntity) {
		return memberRepository.save(memberEntity).getId();
	}

	public List<Long> createAll(List<MemberEntity> list) {
		return list.stream()
			.map(e -> persist(e))
			.collect(Collectors.toList());
	}
}
