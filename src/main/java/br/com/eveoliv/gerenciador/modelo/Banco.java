package br.com.eveoliv.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsu = new ArrayList<>();

	private static Integer chaveSequencial = 1;

	static {
		Empresa alura = new Empresa();
		alura.setId(Banco.chaveSequencial++);
		alura.setNome("Alura");
		alura.setDataAbertura(new Date());
		alura.setCnpj("123.123.123-12");

		Empresa caelum = new Empresa();
		caelum.setId(Banco.chaveSequencial++);
		caelum.setNome("Caelum");
		caelum.setDataAbertura(new Date());
		caelum.setCnpj("321.321.321-21");

		lista.add(caelum);
		lista.add(alura);
		
		Usuario jao = new Usuario();
		jao.setSenha("123");
		jao.setLogin("jao");
		
		Usuario ze = new Usuario();
		ze.setSenha("123");
		ze.setLogin("ze");
		
		listaUsu.add(ze);
		listaUsu.add(jao);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public void remove(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();

			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public void atualiza(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}
	
	public Empresa recupera(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}


	public Usuario validaUsu(String login, String senha) {
		
		for (Usuario usuario : listaUsu) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}			
		}
		return null;
	}
}
