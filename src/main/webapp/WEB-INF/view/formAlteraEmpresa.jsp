<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada?acao=AlteraEmpresa" var="linkServletUnicaEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>
	<form action="${ linkServletUnicaEntrada }" method="post">		
		
		<input type="hidden" name="id" value="${ empresa.id }"/>
		<input type="hidden" name="acao" value="AlteraEmpresa"/>
		
		Nome: <input type="text" name="nome" value="${ empresa.nome }"/>
		<p></p>
		Cnpj: <input type="text" name="cnpj" value="${ empresa.cnpj }"/>
		<p></p>
		DataAbertura: <input type="text" name="data" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
		<p></p>
		<input type="submit"/>
		
	</form>
</body>
</html>