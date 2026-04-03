package com.karina.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired //서비스는 DAO가 필요하다 의존적이다
	private MemberDAO memberDAO;

}
