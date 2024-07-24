package com.shopping.service;

import com.shopping.model.MemberVO;

public interface MemberService {

	// 회원가입
	public void memberJoin(MemberVO member) throws Exception;

	// 아이디 중복 검사
	public int idCheck(String memberId);

	/* 로그인 */
	public MemberVO memberLogin(MemberVO member) throws Exception;
}
