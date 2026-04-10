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
					<h1 class="h3 mb-4 text-gray-800">교수 상세 정보</h1>
					<div class="row justify-content-center">
					<div class="col-6">
						<table class="table">
							<thead class="thead-dark">
							<tr>
							<th>교수 번호</th>
							<th>교수 이름</th>
							<th>교수 주민등록번호</th>
							<th>교수 집 주소</th>
							<th>부서 번호</th>
							</tr>
							</thead>
							
							<tbody>
							
								<tr>
									<td>${detail.professorNo}</td>
									<td>${detail.professorName}</td>
									<td>${detail.professorSsn}</td>									
									<td>${detail.professorAddress}</td>
									<td>${detail.departmentNo}</td>
								</tr>
								
							</tbody>
						</table>
						</div>
					</div>
					
					<div ><a class="btn btn-info" href ="./update?professorNo=${detail.professorNo}">교수수정</a>
						<form action="./delete" method="post">
						<input type="hidden" name="professorNo" value="${detail.professorNo}">
						
						<button class="btn btn-warning" type="submit">삭제</button>
					
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