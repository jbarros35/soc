package br.com.soc.bean;

import java.io.Serializable;

public class Empresa implements Serializable, BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6419475821408724998L;
	private String id;
	private String nome;
	
	public Empresa(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Empresa() {		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
