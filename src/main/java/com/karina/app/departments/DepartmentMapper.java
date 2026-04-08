package com.karina.app.departments;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface DepartmentMapper {
	//인터페이스의 매서드는 무조건 public abstract
	//DAO에서 하는일은 CRUD
	
	//list
	public abstract List<DepartmentDTO> list()throws Exception;
	//detail
	public DepartmentDTO detail(DepartmentDTO departmentDTO)throws Exception;
	//create public와 abstract는 무조건들어가기때문에 생략가능
	int create(DepartmentDTO departmentDTO)throws Exception;
	//update
	int update(DepartmentDTO departmentDTO)throws Exception;
	//delete
	int delete(DepartmentDTO departmentDTO)throws Exception;

}
