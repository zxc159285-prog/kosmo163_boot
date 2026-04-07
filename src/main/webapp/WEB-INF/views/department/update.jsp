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
					<h1 class="h3 mb-4 text-gray-800">수정 페이지</h1>
					<div>
					<form action="./update" method="post">
						  <div class="form-group">
						    <label for="departmentNo">학과 번호</label>
						    <input type="text" name="departmentNo" readonly value="${update.departmentNo}" class="form-control" id="departmentNo">
						  </div>
						  <div class="form-group">
						    <label for="departmentName">학과 이름</label>
						    <input type="text" name="departmentName" value="${update.departmentName}" class="form-control" id="departmentName">
						  </div>
						  <div class="form-group">
						    <label for="category">계열</label>
						    <input type="text" name="category" value="${update.category}" class="form-control" id="category">
						  </div>
						
						  <div class="form-group">
						    <label for="capacity">정원</label>
						    <input type="text" name="capacity" value="${update.capacity}" class="form-control" id="capacity">
						  </div>
						   <div class="form-group">
						    <label for="open">OPEN</label>
						    <input type="radio" name="openYn" ${update.openYn eq 'Y'?'checked':""} value="Y" class="form-control" id="open">
						    <label for="close">CLOSE</label>
						    <input type="radio" name="openYn" ${update.openYn eq 'N'?'checked':""} value="N" class="form-control" id="close">
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