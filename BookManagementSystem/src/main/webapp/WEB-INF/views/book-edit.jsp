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


<title>Edit book page</title>

<link href="../../resources/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<link href="../../resources/css/style.css" rel="stylesheet">

	<script src="../../resources/js/jquery-2.1.1.min.js"></script>
	<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
	<script src="../../resources/js/bootstrap.min.js"></script>
	<script src="../../resources/js/jquery.validate.js"></script>
	<script src="../../resources/js/script.js"></script>
</head>

<body>
	<div class="container">
		<div class="row-fluid">
			<div class="span12">
				<h1>Edit Book</h1>
			</div>
		</div>
		<div class="row-fluid">
			<div class="span6 offset6">
				<div id="maincontent" class="span8">
					<p>${message}</p>
					<form:form id="registration-form" method="POST" commandName="book"
						cssclass="form-horizontal"
						action="${pageContext.request.contextPath}/book/edit/${book.bookId}.html">
						<form:hidden path="bookId" />
						<div class="form-control-group">
							<label class="control-label" for="name">Book Title</label>
							<div class="controls">
								<form:input path="bookTitlePrm" class="input-xlarge"
									name="bookTitlePrm" id="bookTitlePrm" />
							</div>
						</div>

						<div class="form-control-group">
							<label class="control-label" for="name">Total Pages</label>
							<div class="controls">
								<form:input path="totalPages" class="input-xlarge"
									name="totalPages" id="totalPages" />
							</div>
						</div>

						<div class="form-control-group">
							<label class="control-label" for="name">ISBN</label>
							<div class="controls">
								<form:input path="isbn" class="input-xlarge" name="isbn"
									id="isbn" />
							</div>
						</div>

						<div class="form-control-group">
							<label class="control-label" for="name">Published date</label>
							<div class="controls">
								<form:input path="publishedDate" id="datepicker"
									class="input-xlarge" name="datepicker" />
							</div>
						</div>

						<div class="form-control-group">
							<label class="control-label" for="email">Category</label>
							<div class="controls">
								<form:input path="categoryId" class="input-xlarge"
									name="categoryId" id="categoryId" />
							</div>
						</div>
						<div class="form-control-group">
							<label class="control-label" for="message">Publisher</label>
							<div class="controls">
								<form:input path="publisherId" class="input-xlarge"
									name="publisherId" id="publisherId" />
							</div>
						</div>

						<div class="form-actions">
							<button type="submit" class="btn btn-success btn-large">Save</button>
						</div>
					</form:form>
				</div>
				<!-- .span -->
			</div>
			<!-- .row -->

		</div>
		<!-- .container -->
		<script>
			$(function() {
				$("#datepicker").datepicker();
			});
		</script>
		<script>
			addEventListener('load', prettyPrint, false);
			$(document).ready(function() {
				$('pre').addClass('prettyprint linenums');
			});
		</script>
		<p>
			<a href="${pageContext.request.contextPath}/index.html">Home page</a>
		</p>
</body>
</html>