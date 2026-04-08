package com.karina.app.professor;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.karina.app.departments.DepartmentDTO;

@Mapper
public interface ProfessorMapper {
	
	public abstract List<ProfessorDTO> list() throws Exception;
	
	public abstract ProfessorDTO detail(ProfessorDTO professorDTO)throws Exception;
	
	public abstract int create(ProfessorDTO professorDTO) throws Exception;
	
	public abstract int update(ProfessorDTO professorDTO) throws Exception;
	
	public abstract int delete(ProfessorDTO professorDTO) throws Exception;
	
	

}
