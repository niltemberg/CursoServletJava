<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
		<c:if test="${not empty nomeEmpresa }">
			<p>
				Empresa ${nomeEmpresa} cadastrada com sucesso!
			</p>
		</c:if>
		
		<h1>Lista de Empresas</h1>
		
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>
					${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
					<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">Alterar</a>
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">Remover</a>
				</li>
				
			</c:forEach>
		
		</ul>

	</body>
</html>