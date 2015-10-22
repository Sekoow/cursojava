package com.bigriver.samples;

import com.bigriver.samples.dao.ApartamentoDAO;
import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Apartamento;
import com.bigriver.samples.model.Endereco;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.service.VendaPessoa;
import com.bigriver.samples.view.TelaCadastro;
import com.bigriver.samples.view.TelaConsulta;
import com.bigriver.samples.view.TelaDashboard;
import com.bigriver.samples.view.TelaVendas;
import com.guigarage.flatterfx.FlatterFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashBoard extends Application {
	//Titulo da Janela
	static final String TITULO = "Venda de Produtos";
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Carrega um DAO de Apartamentos
		ApartamentoDAO daoAp = new ApartamentoDAO();
		//Carrega um objeto de Apartamento
		Apartamento apartamento = new Apartamento();
		//Carrega um objeto Pessoa e Endereço
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		pessoa.setEndereco(endereco);
		//Carrega um DAO de Pessoas
		PessoaDAO dao = new PessoaDAO();
		//Cria uma tela de cadastro de Pessoas
		TelaCadastro<Pessoa> cadastro = new TelaCadastro<>("Cadastro Pessoa", pessoa, dao, endereco);	
		//Cria um DAO para as Pessoas
		PessoaDAO pessoaDao = new PessoaDAO();
		//Cria uma Tela de Consulta de Pessoas
		TelaConsulta<Pessoa> consulta = new TelaConsulta<>("Consulta Pessoas", pessoaDao);
		
		//Cria um DAO para Apartamentos
		ApartamentoDAO apartamentoDAO = new ApartamentoDAO();		
		//Cria uma Tela de Cadastro de Apartamento
		TelaCadastro<Apartamento> cadastroAp = new TelaCadastro<>("Cadastro de Apartamentos", apartamento, daoAp, endereco);
		//Cria uma Tela de Consulta de apartamentos
		TelaConsulta<Apartamento> consultaAp = new TelaConsulta<>("Consulta Apartamento",apartamentoDAO);
			
		
		//Cria uma tela de DashBoard com as telas de Consulta e Cadastro de Pessoas
		TelaDashboard telaDashboard = new TelaDashboard(consulta, cadastro, cadastroAp, consultaAp);
		
		//Cria uma Scene (JavaFX) com a tela de consulta
		Scene scene = new Scene(telaDashboard);
				
		//Cria uma Janela de Consulta
		primaryStage.setScene(scene);
		
		//Titulo da Aplicação
		primaryStage.setTitle(TITULO);
				
		//Abre a Janela
		primaryStage.show();
		//Quando fechar a aplicação, garante que
		primaryStage.setOnCloseRequest(evt -> {
			//Fecha todas as conexões com a base de dados
			BancoDeDados.closeFactory();
		});
		
		
		//Tema Especial para a Dashboard
		FlatterFX.style();
	}

}
