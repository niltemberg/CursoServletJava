package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();

	static {
		Empresa empresa = new Empresa();
		empresa.setNome("ArtEmLibras");
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Unidiversidade");
		lista.add(empresa1);
		lista.add(empresa);
	}
	
	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
