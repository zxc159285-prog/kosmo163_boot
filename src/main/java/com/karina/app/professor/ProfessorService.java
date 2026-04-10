package com.karina.app.professor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karina.app.page.Pager;
@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorMapper professorDAO;
	
	 public List<ProfessorDTO> list(Pager pager) throws Exception {
		 pager.makePageNumber(professorDAO.getCount());
		 pager.makerRowNumber();
		 
		return professorDAO.list(pager);
	}
	
	 
	 public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception{
		 return professorDAO.detail(professorDTO);
	 }
	 public int create(ProfessorDTO professorDTO) throws Exception{
		 return professorDAO.create(professorDTO);
			
	 }
	 public int update(ProfessorDTO professorDTO) throws Exception{
		 return professorDAO.update(professorDTO);
			
	 }
	 public int delete(ProfessorDTO professorDTO) throws Exception{
		 return professorDAO.delete(professorDTO);
			
	 }

}	
