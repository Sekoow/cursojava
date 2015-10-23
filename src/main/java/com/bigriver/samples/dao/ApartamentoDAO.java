package com.bigriver.samples.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import com.bigriver.samples.BancoDeDados;
import com.bigriver.samples.model.Apartamento;
import com.bigriver.samples.model.Pessoa;

public class ApartamentoDAO implements DAO<Apartamento>{

	@Override
	public Apartamento salvar(Apartamento objeto) {
		// TODO Auto-generated method stub
			//Abre um gerente de entidades
			EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
			//Abre uma transação com o BD
			gerenteEntidades.getTransaction().begin();
			//Guarda o Objeto no BD
			gerenteEntidades.persist(objeto);
			//Conclui a transação com o BD, garantindo a execução da operação
			gerenteEntidades.getTransaction().commit();
			//Fecha o Gerente de Entidades, concluindo o ciclo de vida de operações
			gerenteEntidades.close();
			
			return objeto;		
	}

	@Override
	public Apartamento buscar(int id) {
		//Abre um gerente de entidades
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		//Abre uma transação com o BD
		gerenteEntidades.getTransaction().begin();		
		//Busca uma pessoa no BD pelo ID - X
		Apartamento busca = gerenteEntidades.find(Apartamento.class, id);
		//Conclui a transação com o BD, garantindo a execução da operação
		gerenteEntidades.getTransaction().commit();

		gerenteEntidades.close();
		
		return busca;
	}

	@Override
	public Collection<Apartamento> todos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
