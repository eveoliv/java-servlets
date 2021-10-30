<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkServletUnicaEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>
	<form action="${ linkServletUnicaEntrada }" method="post">	
	
		<input type="hidden" name="acao" value="NovaEmpresa"/>	
		Nome: <input type="text" name="nome"/>
		<p></p>
		Cnpj: <input type="text" name="cnpj"/>
		<p></p>
		DataAbertura: <input type="text" name="data"/>
		<p></p>
		<input type="submit"/>
		
	</form>
</body>
</html>