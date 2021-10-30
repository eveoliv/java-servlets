package br.com.eveoliv.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.eveoliv.gerenciador.modelo.Banco;
import br.com.eveoliv.gerenciador.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usu = banco.validaUsu(login, senha);
		
		if (usu != null) {
			System.out.println("Usuario existe");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usu);
			return "redirect:entrada?acao=ListaEmpresas";
		}
		
		return "redirect:entrada?acao=LoginForm";
	}

}
