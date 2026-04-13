package com.karina.app.professor;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.karina.app.departments.DepartmentDTO;
import com.karina.app.page.Pager;

@Mapper
public interface ProfessorMapper {
	
	Long getCount(Pager pager)throws Exception;
	
	public abstract List<ProfessorDTO> list(Pager pager) throws Exception;
	
	public abstract ProfessorDTO detail(ProfessorDTO professorDTO)throws Exception;
	
	public abstract int create(ProfessorDTO professorDTO) throws Exception;
	
	public abstract int update(ProfessorDTO professorDTO) throws Exception;
	
	public abstract int delete(ProfessorDTO professorDTO) throws Exception;
	
	

}
