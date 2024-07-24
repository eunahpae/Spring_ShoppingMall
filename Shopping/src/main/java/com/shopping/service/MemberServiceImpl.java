package com.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.mapper.MemberMapper;
import com.shopping.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void memberJoin(MemberVO member) throws Exception {
		memberMapper.memberJoin(member);
	}

	@Override
	public int idCheck(String memberId) {
		return memberMapper.idCheck(memberId);
	}

	@Override
	public MemberVO memberLogin(MemberVO member) throws Exception {
		return memberMapper.memberLogin(member);
	}
	
}
