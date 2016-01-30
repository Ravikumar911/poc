<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/ui/css/bootstrap.min.css" />
<title>User Management</title>
</head>
<body>
	<div class="container">
		<div class="container-fluid" style="margin-top: 60px">
			<div class="col-lg-5">
			<h3>User Management</h3>
			<br>
				<form action="create" method="POST">
					<div class="form-group">
						<label for="exampleInputEmail1">First Name</label> <input
							type="text" class="form-control" required name="firstName"
							placeholder="First Name">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Last Name</label> <input
							type="text" class="form-control"  required name="lastName"
							placeholder="Last Name">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Email address</label> <input
							type="email" class="form-control" required name="emailId" placeholder="Email address">
					</div>
					<button class="btn btn-success" type="submit">Create</button>
				</form>
			</div>
			<div class="col-lg-8">
				<table class="table">
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email Address</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<tbody id="list">
					<c:forEach items="${map.users}"
										var="list">
										<tr><td>${list.firstName}</td>
										<td>${list.lastName}</td>
										<td>${list.userEmailId}</td>
										<td><button class="btn btn-primary" onclick="location.href='edit?firstName=${list.firstName}&lastName=${list.lastName}&emailId=${list.userEmailId}&userId=${list.userId}'">Edit</button></td>
										<td><button class="btn btn-danger" onclick="location.href='delete?id=${list.userId}'" >Delete</button></td></tr>
								</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>