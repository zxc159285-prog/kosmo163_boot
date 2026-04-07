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
	
	public int create(DepartmentDTO departmentDTO) {
		return departmentDAO.create(departmentDTO);
	}
	
	public int delete(DepartmentDTO departmentDTO) {
		return departmentDAO.delete(departmentDTO);
	}
	
	public int update(DepartmentDTO departmentDTO) {
		return departmentDAO.update(departmentDTO);
	}
}
