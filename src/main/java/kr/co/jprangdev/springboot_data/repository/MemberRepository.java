package kr.co.jprangdev.springboot_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.jprangdev.springboot_data.entity.MemberEntity;


public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
