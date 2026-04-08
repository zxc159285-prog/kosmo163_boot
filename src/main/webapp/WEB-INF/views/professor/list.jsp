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
					<h1 class="h3 mb-4 text-gray-800">교수 목록</h1>
					<!-- 내용 담는공간 -->
					<div class="row justify-content-center">
					<div class="col-6">
						<table class="table table-dark">
							<thead>  <!-- 제목은 힌번 나오면 됨 -->
								<tr>
									<th>교수 번호</th>
									<th>교수 이름</th>
									<th>부서 번호</th>
								</tr>
							</thead>
							
							<tbody>
								<c:forEach items="${list}" var="p"> 
								
									<tr>
										<td><a href="./detail?professorNo=${p.professorNo}">${p.professorNo}</a></td>
										<td>${p.professorName}</td>
										<td>${p.departmentNo}</td>
									
									</tr>
									
								</c:forEach>
							</tbody>
						</table>
						
						<div>
							<a href ="./create">교수등록</a>
						</div>
					</div>
					</div>
					<!-- 내용 끝 -->
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