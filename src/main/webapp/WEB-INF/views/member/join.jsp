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
					<h1 class="h3 mb-4 text-gray-800">Join Page</h1>

					<div class="col-lg-5 col-sm-12">
						<form action="./join" method="post">
							<div class="form-group">
								<label for="name">NAME</label> <input type="text"
									name="name" class="form-control" id="name">
							</div>
							<div class="form-group">
								<label for=age">AGE</label> <input type="text"
									name="age" class="form-control" id="age">
							</div>
							<div class="form-group">
								<label for="birth">BIRTH</label> <input type="date"
									name="birth" class="form-control" id="birth">
							</div>
							<div class="form-check form-check-inline">
								  <input class="form-check-input" name="num" type="checkbox" id="inlineCheckbox1" value="option1">
								  <label class="form-check-label" for="inlineCheckbox1">1</label>
								</div>
								<div class="form-check form-check-inline">
								  <input class="form-check-input" name="num" type="checkbox" id="inlineCheckbox2" value="option2">
								  <label class="form-check-label" for="inlineCheckbox2">2</label>
								</div>
								<div class="form-check form-check-inline">
								  <input class="form-check-input" name="num" type="checkbox" id="inlineCheckbox3" value="option3">
								  <label class="form-check-label" for="inlineCheckbox3">3 (disabled)</label>
								</div>
							<div class="form-check form-check-inline">
								  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="1">
								  <label class="form-check-label" for="inlineRadio1">1</label>
								</div>
								<div class="form-check form-check-inline">
								  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="2">
								  <label class="form-check-label" for="inlineRadio2">2</label>
								</div>
								<div class="form-check form-check-inline">
								  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="3">
								  <label class="form-check-label" for="inlineRadio3">3 (disabled)</label>
								</div>
							
														<div class="form-group">
							    <label for="exampleFormControlSelect2">Example multiple select</label>
							    <select name="ch" class="form-control" id="exampleFormControlSelect1">
							      <option value="a">1</option>
							      <option value="b">2</option>
							      <option>3</option>
							      <option>4</option>
							      <option>5</option>
							    </select>
							  </div>
							<button type="submit" class="btn btn-primary">Submit</button>
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