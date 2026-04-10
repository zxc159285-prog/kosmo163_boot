package com.karina.app.professor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfessorMapperTest {
	
	@Autowired
	private ProfessorMapper professorMapper;
	
//	//@Test
//	void testList() throws Exception{
//		List<ProfessorDTO> ar=professorMapper.list();
//		
//		assertNotEquals(0, ar.size());
//		System.out.println(ar.size());
//	}

	//@Test
	void testDetail() throws Exception{
		ProfessorDTO professorDTO=new ProfessorDTO();
		professorDTO.setProfessorNo("P002");
		professorMapper.detail(professorDTO);
		
		assertNotNull(professorDTO);
	}

	//@Test
	void testCreate() throws Exception {
		ProfessorDTO professorDTO=new ProfessorDTO();
		professorDTO.setDepartmentNo("058");
		professorDTO.setProfessorAddress("서울시금천구시흥동860-23");
		professorDTO.setProfessorName("조종현");
		professorDTO.setProfessorNo("P150");
		professorDTO.setProfessorSsn("940527-2222222");
		int result=professorMapper.create(professorDTO);
		
		assertNotEquals(0,result);
	}

	//@Test
	void testUpdate() throws Exception{
		ProfessorDTO professorDTO=new ProfessorDTO();
		professorDTO.setDepartmentNo("058");
		professorDTO.setProfessorAddress("서울시 금천구 시흥동 860-23");
		professorDTO.setProfessorName("조종빵");
		professorDTO.setProfessorNo("P150");
		professorDTO.setProfessorSsn("940527-2222222");
		
		int result=professorMapper.update(professorDTO);
		assertNotEquals(0,result);
	}

	@Test
	void testDelete() throws Exception{
		ProfessorDTO professorDTO=new ProfessorDTO();
		professorDTO.setProfessorNo("P150");
		int result=professorMapper.delete(professorDTO);
		assertNotEquals(0,result);
	}

}
