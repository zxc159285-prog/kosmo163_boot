package com.karina.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karina.app.page.Pager;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentMapper departmentDAO;

	
	public List<DepartmentDTO> list(Pager pager)throws Exception{
		pager.makePageNumber(departmentDAO.getCount(pager));
		pager.makerRowNumber();
		return departmentDAO.list(pager);
	}
	
	public DepartmentDTO detail(DepartmentDTO departmentDTO)throws Exception {
		return departmentDAO.detail(departmentDTO);
	}
	
	public int create(DepartmentDTO departmentDTO)throws Exception{
		return departmentDAO.create(departmentDTO);
	}
	
	public int delete(DepartmentDTO departmentDTO)throws Exception {
		return departmentDAO.delete(departmentDTO);
	}
	
	public int update(DepartmentDTO departmentDTO)throws Exception {
		return departmentDAO.update(departmentDTO);
	}
}
