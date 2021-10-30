package br.com.eveoliv.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.eveoliv.gerenciador.modelo.Banco;
import br.com.eveoliv.gerenciador.modelo.Empresa;

//@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//alterando void servide para void doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando uma nova empresa ...");
		
		Empresa empresa = new Empresa();
		empresa.setNome(request.getParameter("nome"));
		empresa.setCnpj(request.getParameter("cnpj"));
		
		//catch and re-trow
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			empresa.setDataAbertura(sdf.parse(request.getParameter("data")));
		} catch (ParseException e) {			
			throw new ServletException(e);
		}
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		response.sendRedirect("listaEmpresas");
		
		//chamar o JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");				
//		request.setAttribute("empresa", empresa.getNome());
//		request.setAttribute("cpf", empresa.getCnpj());	
//		request.setAttribute("data", empresa.getDataAbertura());	
//		rd.forward(request, response);
	        
	}
}
