package com.karina.app.member;



import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//annotation 설명+기능이 포함 이 클래스의 역할은 컨트롤러 라는것을 알려주는것, 서블릿을대신함
@Controller
@RequestMapping("/member/*") //멤버폴더밑에있는건 다 여기로오라는것
public class MemberController {
	
	@Autowired //컨트롤러는 서비스가 필요하다
	private MemberService memberService;

	@RequestMapping(value = "join",method = RequestMethod.POST)
	public void join(MemberDTO memberDTO) {
		//파라미터의 이름과 dto의 setter이름이 같아야한다
		
		System.out.println(memberDTO.getName());
		
		
		System.out.println(memberDTO.getAge());
		
		System.out.println("join Post");
		
		
	}
	
//	@RequestMapping(value = "join",method = RequestMethod.POST)
//	public void join(@RequestParam(name = "name") String name, @RequestParam(name="age") Integer age ) {
//		MemberDTO memberDTO=new MemberDTO();
//		memberDTO.setName(name);
//		memberDTO.setAge(age);
//		
//		System.out.println(name);
//		System.out.println(age);
//		
//		System.out.println("join Post");
//		
//		
//	}
	
    
	
//	@RequestMapping(value = "join",method = RequestMethod.POST)
//	public void join2(HttpServletRequest request) {
//		String name=request.getParameter("name");
//		String age=request.getParameter("age");
//		String birth=request.getParameter("birth");
//	
//		
//		String[]nums=request.getParameterValues("num");
//		System.out.println(name+age+birth);
//		
//		
//	}
//	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		System.out.println("회원가입페이지");
		
		
		return "member/join";
	}

	@RequestMapping ("login") //리턴과 똑같이 통일할수있음
	public String login() {
		
		return "member/login";
	}
}
