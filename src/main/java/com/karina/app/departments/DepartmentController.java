package com.karina.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("list")
	public void list() {
		List<DepartmentDTO> ar = departmentService.list();
		
		for(DepartmentDTO dto:ar) {
			System.out.println(dto);
		}
	}
	@GetMapping("detail")
	public void detail(@RequestParam(name="num") String num) {
		DepartmentDTO departmentDTO=departmentService.detail(num);
		System.out.println(departmentDTO);
	}

}
