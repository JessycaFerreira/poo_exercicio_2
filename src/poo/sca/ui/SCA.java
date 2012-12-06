package poo.sca.ui;

import java.util.Scanner;

import poo.sca.Disciplina;
import poo.sca.SCAException;
import poo.sca.SCAFacade;
import poo.sca.SCARuntimeException;
import poo.sca.io.SCAPersistenciaException;


public class SCA {

	private static SCAFacade facade;
	private static Scanner sc;

	public SCA() {
		facade = new SCAFacade();
		sc = new Scanner(System.in);
	}

	public static void main(String args[]) throws SCARuntimeException, SCAException {
	
		int opcao = 0;
		do {
			exibirMenu();
			opcao = Integer.parseInt(lerEntradaUsuario("digite sua opção: > "));
			switch (opcao) {
				case 1: criarNovaTurma(); 
						break;
				case 2: criarNovaDisciplina();	
						break;
				case 3: criarNovoCurso();
						break;								
				case 4: criarNovoProfessor();
						break;
				default: System.out.println("Por favor, informe uma opção válida.");
			}
		} while (opcao != 0);

	} 

	
	public static void exibirMenu() {
		System.out.println("***** MENU ******\n" + "1. Criar Turma \n"
				+ "2. Criar Disciplina \n" + "3. Criar Curso \n"
				+ "4. Criar Professor \n" + "0. Sair \n");
	}

	public static String lerEntradaUsuario(String pergunta) {
		System.out.println(pergunta);
		return sc.nextLine();
	}

	public static void criarNovaTurma(){
		
		try {
			int codigo = Integer.parseInt(lerEntradaUsuario("Informe o código da disciplina da Turma:"));
			int numero = Integer.parseInt(lerEntradaUsuario("Informe o número da Turma:"));
			String periodo = lerEntradaUsuario("Informe o período:");
			Disciplina disc = facade.getDisciplina(codigo);
			facade.criarTurma(periodo, disc, numero);

		} catch (SCAPersistenciaException ex) {
			System.err.println(ex.getMessage());
		} catch (SCAException ex) {
			System.err.println(ex.getMessage());
		} catch (SCARuntimeException ex) {
			System.err.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.err.println("Entrada inválida!");
		}
		
	}
	
	
	public static void criarNovaDisciplina() {
		
		try {
			
			String nome = lerEntradaUsuario("informe o nome da disciplina");
			int cod = Integer.parseInt(lerEntradaUsuario("Informe o código da disciplina"));
			facade.criarDisciplina(nome, cod);
			
		} catch (SCAPersistenciaException ex) {
			System.err.println(ex.getMessage());
		} catch (SCAException ex) {
			System.err.println(ex.getMessage());
		} catch (SCARuntimeException ex) {
			System.err.println(ex.getMessage());
		} catch (NumberFormatException ex){
			System.err.println("Entrada inválida!");
		}
		
	}
	
	public static void criarNovoCurso() {
		
		try{
			
			int codigo = Integer.parseInt(lerEntradaUsuario("Informe o código do curso"));
			String nome = lerEntradaUsuario("Informe o nome do curso:");
			facade.criarCurso(nome, codigo);
			
		} catch (SCAPersistenciaException ex) {
			System.err.println(ex.getMessage());
		} catch (SCAException ex) {
			System.err.println(ex.getMessage());
		} catch (SCARuntimeException ex) {
			System.err.println(ex.getMessage());
		} catch (NumberFormatException ex){
			System.err.println("Entrada inválida!");
		}
		
	}
	
	public static void criarNovoProfessor() {
		
		try{
			int matricula = Integer.parseInt(lerEntradaUsuario("Informe a matrícula do professor:"));
			String nome = lerEntradaUsuario("Informe o nome do professor:");
			facade.criarProfessor(nome, matricula);
			
		} catch (SCAPersistenciaException ex) {
			System.err.println(ex.getMessage());
		} catch (SCAException ex) {
			System.err.println(ex.getMessage());
		} catch (SCARuntimeException ex) {
			System.err.println(ex.getMessage());
		} catch (NumberFormatException ex){
			System.err.println("Entrada inválida!");
		}
		
	}
	
}
