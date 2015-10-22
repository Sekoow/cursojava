package com.bigriver.samples;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Endereco;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.model.Endereco.Estado;
import com.bigriver.samples.model.Apartamento;

/**
 * Classe para testar ações de cadastro ao BD
 * @author Rodney
 *
 */
public class TestarCadastros {
	public static void main(String[] args) {
		//Cria uma Entidade Pessoa, e seu Endereco
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		Apartamento apartamento = new Apartamento();
		
		//Adiciona os dados nas Entidades
		pessoa.setNome("João Pedro Butiá");
		pessoa.setIdade(26);
		
		endereco.setCidade("Santo Ângelo");
		endereco.setEstado(Estado.RS);
		endereco.setRua("Rua Marquês do Herval");
		endereco.setNumero(984);
		
		//Adiciona o relacionamento entre as entidades
		pessoa.setEndereco(endereco);
		
		//Cria um repositório de entidades
		PessoaDAO pessoaDao = new PessoaDAO();
		
		//Salva uma pessoa
		pessoaDao.salvar(pessoa);
	}
}
