package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Date dataAbertura = null;
		String nomeEmpresa = request.getParameter("nome");
		String dataAberturaString = request.getParameter("data");
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataAberturaString);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("nomeEmpresa", empresa.getNome());
		request.setAttribute("dataAbertura", empresa.getDataAbertura());
		
		return "redirect:entrada?acao=ListaEmpresas";
		
		
		//response.sendRedirect("entrada?acao=ListaEmpresas");
		
//		//chamando o JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		rd.forward(request, response);
	}

}
