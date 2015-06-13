<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
  
 <link href="resources/css/bootstrap.min.css" rel="stylesheet" />
 <script src="resources/js/jquery-2.1.1.min.js"></script>
 <script src="resources/js/bootstrap.min.js"></script>

<title>Welcome to Book Mangement System</title>
 
         
</head>
<body>
    
<h1>Book Mangement System</h1>
<p>
${message}<br/>

<p>
	<a href="${pageContext.request.contextPath}/book/add.html">Add New Book</a>
</p>
<p>
	<a href="${pageContext.request.contextPath}/book/list.html">Book list</a>
</p>
</body>
</html>