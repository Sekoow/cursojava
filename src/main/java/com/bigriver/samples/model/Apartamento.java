package com.bigriver.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.dooapp.fxform.annotation.NonVisual;

@Entity
public class Apartamento {
	
	private String endereco;
	private float preco;
	private float tamanho;
	private int numero;
	
	@NonVisual
	private int codAp;	
	
	@NonVisual
	Venda venda;
	
	
	@Id
	@GeneratedValue
	public int getCodAp() {
		return codAp;
	}
	public void setCodAp(int codAp) {
		this.codAp = codAp;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@OneToOne(mappedBy = "apartamento")
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
