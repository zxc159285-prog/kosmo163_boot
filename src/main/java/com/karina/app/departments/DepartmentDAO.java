package com.karina.app.departments;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	
	private final String NAMESPACE="com.karina.app.departments.DepartmentDAO.";
	
	//어느 namespace의 어떤 id를 가진 쿼리 태그를 실행할것인가
	
	public List<DepartmentDTO> list() {
		//사용하려는 mapper의 namespace.id
		return session.selectList(NAMESPACE+"list"); //결과물이 여러개면 리스트 디테일페이지처럼 결과물이 하나면 셀렉트원
	}
	
	public DepartmentDTO detail(String num) {
		
		return session.selectOne(NAMESPACE+"detail",num);
	}
	
	public void create() {
		session.insert(NAMESPACE+"create");
	}
	
	public void update() {
		session.update(NAMESPACE+"update");
	}

}
