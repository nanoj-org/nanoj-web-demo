<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>boolean.jsp</h1>
<h2>action name = ${action.name}</h2>

<form action="${action.requestURI}" >
<table>
<tr> <td>Param 1 : </td><td><input name="p1" value="${fieldvalue.p1}" /></td></tr>
</table>
<button type="submit" name="action.method" value="isTrue" >isTrue</button>
</form>

<h2>Result = ${result} </h2>
 
</body>
</html>