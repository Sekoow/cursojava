package com.bigriver.samples.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.dooapp.fxform.annotation.NonVisual;

@Entity
public class Venda {
	
	
	private int codVenda;
	
	@NonVisual
	private Date timestamps;
	

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
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date Timestamps(){
		return timestamps;
	}	

	public void setTimestamps(Date timestamps) {
		// TODO Auto-generated method stub
		this.timestamps = timestamps;
	}

	
	
	
	
	
	

}
