package com.ofm.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {

	@Autowired
	private SqlSession sqlsession;
	
	private static final String namespace = "MemberMapper.";
	
	
	@Override
	public void join(MemberDTO memberDTO) {
		
		sqlsession.insert(namespace+"Join", memberDTO);
	
		
		

	}

}
