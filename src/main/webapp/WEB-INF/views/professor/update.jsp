<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">교수 수정하기</h1>
					<div>
					<form action="./create" method="post">
						  <div class="form-group">
						    <label hidden for="professorNo">교수 번호</label>
						    <input type="text" name="professorNo" value="${update.professorNo}" class="form-control" id="professorNo" readonly>
						  </div>
						  
						  <div class="form-group">
						    <label for="professorName">교수 이름</label>
						    <input type="text" name="professorName" value="${update.professorName}" class="form-control" id="professorName">
						  </div>
						  
						  <div class="form-group">
						    <label for="professorSsn">교수 주민등록번호</label>
						    <input type="text" name="professorSsn"  value="${update.professorSsn}" class="form-control" id="professorSsn">
						  </div>
						  
						  <div class="form-group">
						    <label for="departmentNo">부서 번호</label>
						    <input type="text" name="departmentNo" value="${update.departmentNo}" class="form-control" id="departmentNo">
						  </div>
						 
						  <button type="submit" class="btn btn-primary">저장하기</button>
						
					</form>
					</div>

				</div>
				<!-- End Page Container-fluid-->
			</div>
			<!-- End Page Content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- End Content-wrapper -->
	</div>
	<!-- End wrapper -->
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
</body>
</html>