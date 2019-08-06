package br.imd.ufrn.aula05.dominio;

import java.io.Serializable;

/**
 * Classe abstrata para representar entidades persistentes.
 * @author itamir
 *
 */
public abstract class AbstractEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * identificador/chave primária.
	 */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
