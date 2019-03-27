package com.example.algamoney.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patio   implements Serializable { /* Categoria correspondente a tabela */

	private static final long serialVersionUID = 1L; /* Id começa com 1 */
	@Id 
	private Integer Id;
	private String descricao;
	private Integer numerovagas;
	private double vagasporhora;
	
	public Patio() {}
	
	public Patio(Integer id, String descricao, Integer numerovagas, double vagasporhora) {
		super();
		Id = id;
		this.descricao = descricao;
		this.numerovagas = numerovagas;
		this.vagasporhora = vagasporhora;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		Patio other = (Patio) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNumerovagas() {
		return numerovagas;
	}

	public void setNumerovagas(Integer numerovagas) {
		this.numerovagas = numerovagas;
	}

	public double getVagasporhora() {
		return vagasporhora;
	}

	public void setVagasporhora(double vagasporhora) {
		this.vagasporhora = vagasporhora;
	}
	
	
}
