<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>${title}</title>
</head>
<body>
<h1>Template 1</h1>
<h2>Template 1 - Header </h2>
<jsp:include page="${action.viewPage}"></jsp:include>
<h2>Template 1 - Footer </h2>
</body> 
</html>