package com.karina.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.karina.app.page.Pager;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("list")
	public String list(Pager pager,Model model) throws Exception {
		List<DepartmentDTO> ar = departmentService.list(pager);
		
		//request와 비슷한 역할, 스프링이 제공함 모델 인터페이스가 임포트되야함
		model.addAttribute("list", ar);
		return "department/list";
	}
	@GetMapping("detail")
	public void detail(DepartmentDTO departmentDTO,Model model) throws Exception {
		departmentDTO=departmentService.detail(departmentDTO);
		
		
		model.addAttribute("detail", departmentDTO);
	}
	
	@GetMapping("create")//url정보와 jsp의 경로가 같다면 void로 리턴한다
	public void create() {}
	
	@PostMapping("create") 
	public String create(DepartmentDTO departmentDTO) throws Exception {
		int result = departmentService.create(departmentDTO);
		
		
		//redirect
		return "redirect:./list";
	}
	
	@PostMapping("delete")
	public String delete(DepartmentDTO departmentDTO) throws Exception {
		int result = departmentService.delete(departmentDTO);
		
		
		return "redirect:./list";
	}
	@GetMapping("update")
	public void update(DepartmentDTO departmentDTO,Model model) throws Exception {
		departmentDTO = departmentService.detail(departmentDTO);
		
		model.addAttribute("update",departmentDTO);
	}
	
	@PostMapping("update")
	public String update(DepartmentDTO departmentDTO) throws Exception {
		
		
		int result = departmentService.update(departmentDTO);
		
		return "redirect:./list";
	}
}
