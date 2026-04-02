package com.karina.app.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation 설명+기능이 포함 이 클래스의 역할은 컨트롤러 라는것을 알려주는것, 서블릿을대신함
@Controller
@RequestMapping("/member/*") //멤버폴더밑에있는건 다 여기로오라는것
public class MemberController {
	
	@RequestMapping("join")
	public String join() {
		System.out.println("회원가입페이지");
		
		return "member/join";
	}

	@RequestMapping ("login") //리턴과 똑같이 통일할수있음
	public String login() {
		
		return "member/login";
	}
}
