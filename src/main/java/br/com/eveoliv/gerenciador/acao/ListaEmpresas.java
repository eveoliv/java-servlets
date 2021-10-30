package br.com.eveoliv.gerenciador.acao;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eveoliv.gerenciador.modelo.Banco;
import br.com.eveoliv.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
				
		request.setAttribute("empresas", lista);			
		
		return "forward:listaEmpresas.jsp";
	}
}
