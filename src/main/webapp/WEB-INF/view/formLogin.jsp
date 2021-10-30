<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkServletUnicaEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Login</title>
</head>
<body>
	<form action="${ linkServletUnicaEntrada }" method="post">	
	
		<input type="hidden" name="acao" value="Login"/>	
		Login: <input type="text" name="login"/>
		<p></p>
		Senha: <input type="password" name="senha"/>
		<p></p>
		
		<input type="submit"/>
		
	</form>
</body>
</html>