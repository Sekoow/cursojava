package com.bigriver.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.dooapp.fxform.annotation.NonVisual;

@Entity
public class Venda {
	
	
	private int codVenda;
	

    @NonVisual
	private Apartamento apartamento;
    @NonVisual
	private Pessoa pessoa;
	
    
	@Id
	@GeneratedValue
	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	
	
	@OneToOne
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@OneToOne
	public Apartamento getApartamento() {
		return apartamento;
	}
	
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	
	
	
	
	
	

}
