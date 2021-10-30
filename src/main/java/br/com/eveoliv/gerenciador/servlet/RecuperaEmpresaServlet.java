package br.com.eveoliv.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eveoliv.gerenciador.modelo.Banco;
import br.com.eveoliv.gerenciador.modelo.Empresa;

//@WebServlet("/recuperaEmpresa")
public class RecuperaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));

		System.out.println("Retornando o id: " + id);

		Banco banco = new Banco();
		Empresa empresa = banco.recupera(id);			
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
	}
}
