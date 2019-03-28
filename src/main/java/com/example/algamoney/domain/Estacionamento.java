package com.example.algamoney.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Estacionamento implements Serializable { 

	private static final long serialVersionUID = 1L; 
	@Id 
	private Integer ID;
	
	@NotNull
	private Date dataentrada;
	
	@NotNull
	private Date datasaida;
	private Time tempopermanencia;
	private double valorpago;
	private Integer idveiculos;


	public Estacionamento(Integer iD, @NotNull Date dataentrada, @NotNull Date datasaida, Time tempopermanencia,
			double valorpago, Integer idveiculos) {
		super();
		ID = iD;
		this.dataentrada = dataentrada;
		this.datasaida = datasaida;
		this.tempopermanencia = tempopermanencia;
		this.valorpago = valorpago;
		this.idveiculos = idveiculos;
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
		Estacionamento other = (Estacionamento) obj;
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

	public Date getDataentrada() {
		return dataentrada;
	}

	public void setDataentrada(Date dataentrada) {
		this.dataentrada = dataentrada;
	}

	public Date getDatasaida() {
		return datasaida;
	}

	public void setDatasaida(Date datasaida) {
		this.datasaida = datasaida;
	}

	public Time getTempopermanencia() {
		return tempopermanencia;
	}

	public void setTempopermanencia(Time tempopermanencia) {
		this.tempopermanencia = tempopermanencia;
	}

	public double getValorpago() {
		return valorpago;
	}

	public void setValorpago(double valorpago) {
		this.valorpago = valorpago;
	}

	public Integer getIdveiculos() {
		return idveiculos;
	}

	public void setIdveiculos(Integer idveiculos) {
		this.idveiculos = idveiculos;
	}
}
