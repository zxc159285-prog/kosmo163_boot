package com.karina.app.departments;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	//전체목록
	
	@GetMapping("list")
	public void list() throws Exception {
		System.out.println("Controller List");
		List<DepartmentDTO> ar=departmentService.list();
		
//		for(int i=0; i<ar.size();i++) {
//			System.out.println(ar.get(i));
//		}
		//for(꺼낸 데이터타입 변수명:collection){}  위에꺼랑 같음
		for(DepartmentDTO dto:ar) {
			System.out.println(dto);
			
		}
	}
}
