<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body>
	
	<c:if test="${not empty empresa }">
		<p>
			Empresa ${nomeEmpresa} cadastrada com sucesso!
		</p>
	</c:if>
	
	<c:if test="${empty empresa }">
		<p>
			Nenhuma empresa cadastrada!!
		</p>
	
	</c:if>
		
	</body>
</html>