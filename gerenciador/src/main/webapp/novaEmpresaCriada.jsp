<% 
	//scriptlet
	String nomeEmpresa = (String) request.getAttribute("nomeEmpresa");
	System.out.println(nomeEmpresa);

%>


<html><body><p>Empresa <%= nomeEmpresa %> cadastrada com sucesso!</p></body></html>