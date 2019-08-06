package br.imd.ufrn.aula05.dominio;

import java.util.List;

/**
 * Classe que repesenta um usuário do sistema.
 * @author itamir
 */
public class Usuario{
	
	private String login;
	
	private String senha;
	
	private String email;
	
	private Pessoa pessoa;
	
	/**
	 * Papéis do usuário (RBAC).
	 */
	private List<Papel> papeis;
	
	public Usuario() {}
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(String login, String senha, String email) {
		this.login = login;
		this.senha = senha;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.login + " - "+ this.pessoa.getNome();
	}
	
}
