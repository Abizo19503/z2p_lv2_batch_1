<%@page import="java.util.ArrayList"%>
<%@page import="com.mmit.entity.Batch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="common/res.jsp"></jsp:include>
</head>
<body>
	<!-- nav -->
	<jsp:include page="common/nav.jsp"></jsp:include>
	<!-- body -->
	<div class="container">
		<div class="row">
			<div class="col-6">
				<form action="add-batch" method="post">
					<div class="mb-3">
						<label for="batch" class="form-label">Batch Name</label> <input
							type="text" class="form-control" name="BatchName" id="batch"
							required="required" />
					</div>
					<div class="mb-3">
						<label for="date" class="form-label">Date</label> <input
							type="date" class="form-control" name="date" id="date"
							required="required" />
					</div>
					<div class="row">
						<div class="col-6">
							<button class="btn btn-danger w-100" type="reset">Clear</button>
						</div>
						<div class="col-6">
							<button class="btn btn-primary w-100" type="submit">Save</button>
						</div>
					</div>


				</form>
			</div>
			<div class="col-6">
			<table class="table">
			<thead>
				<tr>
					<td>No</td>
					<td>Name</td>
					<td>Date</td>
				</tr>
			</thead>
			<tbody>
			<%List<Batch> list = (ArrayList<Batch>) application.getAttribute("batches"); 
			if(list == null)
				list = new ArrayList<>();
			for(int i = 0;i < list.size();i++) {
					Batch tmp = list.get(i);
			%>
			<tr>
				<td><%= (i+1) %></td>
				<td><%= tmp.getName() %></td>
				<td><%= tmp.getStart_date() %></td>
				
				<% } %>
			
			</tr>
			
			</tbody>
			
			</table>
			
			</div>
		</div>
	</div>
	<!-- footer -->
	<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>