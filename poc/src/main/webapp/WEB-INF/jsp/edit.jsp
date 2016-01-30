<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/ui/css/bootstrap.min.css" />
<title>Edit User</title>
</head>
<body>
	<div class="container">
		<div class="container-fluid" style="margin-top: 60px">
			<div class="col-lg-5">
			<h3>Edit User</h3>
			<br>
			<form action="update" method="POST">
					<div class="form-group">
						<label for="exampleInputEmail1">First Name</label> <input
							type="text" class="form-control" required name="firstName"
							placeholder="First Name" value=<%=request.getParameter("firstName")%>>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Last Name</label> <input
							type="text" class="form-control" required name="lastName"
							placeholder="Last Name" value=<%=request.getParameter("lastName")%>>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Email address</label> <input
							type="email" class="form-control" required name="emailId" placeholder="Email address" value=<%=request.getParameter("emailId")%>>
					</div>
					<input type="hidden" name="userId" value=<%=request.getParameter("userId")%>>
					<button class="btn btn-success" type="submit">Update</button>
				</form>
			
			</div>
		</div>
	</div>
</body>
</html>