package com.karina.app.home;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//객체생성 + 역할
@Controller
public class HomeController {
	@Autowired
	

		@RequestMapping(value="/" , method = RequestMethod.GET)
		public String home() throws Exception{
			
			
		
		
			
			return "index";
		}
}
