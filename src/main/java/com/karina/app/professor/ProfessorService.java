package com.karina.app.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorMapper professorDAO;
	
	
	 public List<ProfessorDTO> list() throws Exception {
		return professorDAO.list();
	}

}
