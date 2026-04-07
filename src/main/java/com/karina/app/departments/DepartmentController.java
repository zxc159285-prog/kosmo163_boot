package com.karina.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("list")
	public String list(Model model) {
		List<DepartmentDTO> ar = departmentService.list();
		
		//request와 비슷한 역할, 스프링이 제공함 모델 인터페이스가 임포트되야함
		model.addAttribute("list", ar);
		return "department/list";
	}
	@GetMapping("detail")
	public void detail(@RequestParam(name="num") String num,Model model) {
		DepartmentDTO departmentDTO=departmentService.detail(num);
		
		
		model.addAttribute("detail", departmentDTO);
	}
	
	@GetMapping("create")//url정보와 jsp의 경로가 같다면 void로 리턴한다
	public void create() {}
	
	@PostMapping("create") //원래 포스트매핑으로해야함
	public String create(DepartmentDTO departmentDTO) {
		int result = departmentService.create(departmentDTO);
		
		
		//redirect
		return "redirect:./list";
	}
	
	@PostMapping("delete")
	public String delete(DepartmentDTO departmentDTO) {
		int result = departmentService.delete(departmentDTO);
		
		
		return "redirect:./list";
	}
	@GetMapping("update")
	public void update(DepartmentDTO departmentDTO,Model model) {
		departmentDTO = departmentService.detail(departmentDTO.getDepartmentNo());
		
		model.addAttribute("update",departmentDTO);
	}
	
	@PostMapping("update")
	public String update(DepartmentDTO departmentDTO) {
		
		
		int result = departmentService.update(departmentDTO);
		
		return "redirect:./list";
	}
}
