package com.shopping.mapper;

import com.shopping.model.MemberVO;

public interface MemberMapper {

	// 회원가입
	public void memberJoin(MemberVO member);

	public int idCheck(String memberId);

	/* 로그인 */
	public MemberVO memberLogin(MemberVO member);
}
