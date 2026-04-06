package com.karina.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	public List<DepartmentDTO> list(){
		return departmentDAO.list();
	}
	
	public DepartmentDTO detail(String num) {
		return departmentDAO.detail(num);
	}
	
}
