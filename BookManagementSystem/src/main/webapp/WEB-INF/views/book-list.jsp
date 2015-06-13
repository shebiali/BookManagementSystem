<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    
<title>List of Book</title>

 <!-- Bootstrap -->
 <link href="../resources/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../resources/js/jquery-2.1.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../resources/js/bootstrap.min.js"></script>
    
<h1>List of books</h1>
<p>Here you can see the list of the books, edit them, remove or update.</p>
<table class="table table-striped" border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">Title</th><th width="15%">ISBN</th><th width="10%">Total pages</th>
<th width="10%">Published date</th><th width="10%">Category</th><th width="10%">Publisher</th>
<th width="10%">Action</th>
</tr>
</thead>
<tbody>
<c:forEach var="book" items="${books}">
<tr>
	
	<td>${book.bookTitlePrm}</td>
	<td>${book.isbn}</td>
	<td>${book.totalPages}</td>
	<td>${book.publishedDate}</td>
	<td>${book.categoryId}</td>
	<td>${book.publisherId}</td>
	<td>
	<a href="${pageContext.request.contextPath}/book/edit/${book.bookId}.html">Edit</a><br/>
	<a href="${pageContext.request.contextPath}/book/delete/${book.bookId}.html">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>

</body>
</html>