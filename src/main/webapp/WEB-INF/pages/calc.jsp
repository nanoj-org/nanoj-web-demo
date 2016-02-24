<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>calc.jsp  (v3)</h1>
<h2>action name = ${action.name}</h2>

<!-- 
<form action="${action.root}/${action.name}" >
<form action="${action.absoluteURL}" >
 -->
<form action="${action.relativeURL}" >

<table>
<tr> <td>Param 1 : </td><td><input name="p1" value="${fieldvalue.p1}" /></td></tr>
<tr> <td>Param 2 : </td><td><input name="p2" value="${fieldvalue.p2}" /></td></tr>
</table>
<button type="submit" name="action.method" value="add">Add</button>  ${METHOD_PARAM_NAME} ${ACTION_METHOD}
<button type="submit" name="action.method" value="sub">Sub</button>
<button type="submit" name="action.method" value="div">Div</button>
</form>

<h2>Result = ${result}  ( action name = ${action.name}, action method = ${action.method} )</h2>
<h2>Dumb value = ${dumbValue}</h2>
<h2>Action object : ${action}</h2>
<ul>
<li>action.absoluteURL = ${action.absoluteURL}
<li>action.relativeURL = ${action.relativeURL}
<li>action.root   = ${action.root}
<li>action.name   = ${action.name}
<li>action.method = ${action.method}
<li>action.className = ${action.className}
<li>action.viewPage  = ${action.viewPage}
</ul>

</body>
</html>