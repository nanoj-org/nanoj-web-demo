<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>index.jsp</h1>
<h3>Action name : ${action.name} ( original name = ${action.originalName})</h3>
<ul>
<li> <a href="${action.requestURI}add" > Action 'add'</a></li>
<li> <a href="${action.requestURI}calc" > Action 'calc'</a></li>
<li> <a href="${action.requestURI}boolean" > Action 'boolean'</a></li>
<li> <a href="${action.requestURI}hello" > Action 'hello'</a></li>
</ul>
 
</body>
</html>