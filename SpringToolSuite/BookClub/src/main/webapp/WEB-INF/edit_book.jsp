<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container mt-3">
		<div class="d-flex align-items-center justify-content-between">
			<h1>Change your Entry</h1>
			<a href="/home">back to the book shelves</a>
		</div>
		<div>
			<form:form action="/books/${book.id}/edit" method="post" modelAttribute="book">
				<input type="hidden" name="_method" value="put">
				<p>
					<form:label path="title">Title:</form:label>
					<form:errors path="title" class="text-danger"/>
					<form:input path="title" class="form-control" />
				</p>
				<p>
					<form:label path="author">Author:</form:label>
					<form:errors path="author" class="text-danger"/>
					<form:input path="author" class="form-control" />
				</p>
				<p>
					<form:label path="thoughts">My thoughts:</form:label>
					<form:errors path="thoughts" class="text-danger"/>
					<form:input path="thoughts" class="form-control" />
				</p>
				<input type="submit" value="Update">
			</form:form>
		</div>
	
	</div>

</body>
</html>