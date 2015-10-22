package com.bigriver.samples.model;

import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Venda {
	
	private int codVenda;
	private int id;


	private Apartamento apartamento;
	
	@Id
	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	
	@OneToOne
	public Apartamento getApartamento() {
		return apartamento;
	}
	
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	@OneToOne
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	

}
