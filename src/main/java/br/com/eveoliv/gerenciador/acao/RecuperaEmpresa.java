package br.com.eveoliv.gerenciador.acao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eveoliv.gerenciador.modelo.Banco;
import br.com.eveoliv.gerenciador.modelo.Empresa;

public class RecuperaEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));

		System.out.println("Retornando o id: " + id);

		Banco banco = new Banco();
		Empresa empresa = banco.recupera(id);			
		
		request.setAttribute("empresa", empresa);
		return "forward:formAlteraEmpresa.jsp";						
	}

}
