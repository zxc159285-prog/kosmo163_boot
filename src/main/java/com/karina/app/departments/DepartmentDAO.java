package com.karina.app.departments;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("DAO List");
		return session.selectList("com.karina.app.departments.DepartmentDAO.list");//mapper의 namespace.id명
		
		//1.DB연결
	
		//2.sql문 생성
		
		//3.미리전송
	
		//4.?셋팅
		
		//5.최종전송 및 결과처리
		
		//6.연결해제
	
		
		
		
	
	}
	
	
}
