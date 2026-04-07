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
					<h1 class="h3 mb-4 text-gray-800">학과 상세 정보</h1>
					<div class="row justify-content-center">
					<div class="col-6">
						<table class="table table-dark">
							<thead>
							<tr>
							<th>학과번호</th>
							<th>학과명</th>
							<th>계열</th>
							<th>개설여부</th>
							<th>정원</th>
							</tr>
							</thead>
							
							<tbody>
							
								<tr>
									<td>${detail.departmentNo}</td>
									<td>${detail.departmentName}</td>
									<td>${detail.category}</td>
									
									<c:if test="${detail.openYn eq 'Y'}"><td>
									OPEN</td>
									</c:if>
									
									
									<c:if test="${detail.openYn eq 'N'}">
									<td>
									CLOSE</td>
									</c:if>
									
									<td>${detail.capacity}</td>
								</tr>
								
							</tbody>
						</table>
						</div>
					</div>
					
					<div ><a class="btn btn-info" href ="./update?departmentNo=${detail.departmentNo}">학과수정</a>
						<form action="./delete" method="post">
						<input type="hidden" name="departmentNo" value="${detail.departmentNo}">
						
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