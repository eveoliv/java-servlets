<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.eveoliv.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada?acao=" var="linkServletUnicaEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciador</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>
	
	Usuario Logado: ${ usuarioLogado.login }
	<p></p>
	<c:if test="${ not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
    Lista de empresas: <br />
    
    <ul>
    	<c:forEach items="${empresas}" var="empresa">
    		<li>
    			${ empresa.nome } [ ${ empresa.cnpj } ] <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
    			<a href="${ linkServletUnicaEntrada }RemoveEmpresa&id=${ empresa.id }"> remover</a>
    			<a> | </a>
    			<a href="${ linkServletUnicaEntrada }RecuperaEmpresa&id=${ empresa.id }"> editar</a>
    		</li>	
    	</c:forEach>
    </ul>         

</body>
</html>