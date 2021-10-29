<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/main.css" />
<title>Languages App</title>
</head>
<body>
	<div class="container">
		<h1>Details for Language #${ language.id }</h1>
		<hr />
		<h1><c:out value="${language.name}"/></h1>
		<p>Creator: <c:out value="${language.creator}"/></p>
		<p>Current Version: <c:out value="${language.currentVersion}"/></p>
		<a class="btn btn-primary" href="/${language.id}/edit">Edit Language</a>
		<form id="delete-form" action="/${language.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input class="btn btn-danger" type="submit" value="Delete">
		</form>
	</div>
</body>
</html>