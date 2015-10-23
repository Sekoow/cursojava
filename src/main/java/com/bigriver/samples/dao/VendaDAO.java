package com.bigriver.samples.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import com.bigriver.samples.BancoDeDados;
import com.bigriver.samples.model.Venda;


public class VendaDAO implements DAO<Venda> {

	@Override
	public Venda salvar(Venda objeto) {
		// TODO Auto-generated method stub
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		
		gerenteEntidades.getTransaction().begin();
		
		gerenteEntidades.persist(objeto);
		
		gerenteEntidades.getTransaction().commit();
		
		gerenteEntidades.close();
		return objeto;
	}

	@Override
	public Venda buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Venda> todos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
