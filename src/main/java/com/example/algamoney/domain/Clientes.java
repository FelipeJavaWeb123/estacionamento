package com.example.algamoney.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

@Entity 
public class Clientes  implements Serializable { 

		private static final long serialVersionUID = 1L; 
		@Id 
		private Integer ID;
		
		@NotNull
		private String nome;
		
		@NotNull
		@CPF
		private String CPF;
		
		public Clientes() {}

		public Clientes(Integer iD, String nome, String cPF) {
			super();
			ID = iD;
			this.nome = nome;
			CPF = cPF;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((ID == null) ? 0 : ID.hashCode());
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
			Clientes other = (Clientes) obj;
			if (ID == null) {
				if (other.ID != null)
					return false;
			} else if (!ID.equals(other.ID))
				return false;
			return true;
		}

		public Integer getID() {
			return ID;
		}

		public void setID(Integer iD) {
			ID = iD;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}
}
