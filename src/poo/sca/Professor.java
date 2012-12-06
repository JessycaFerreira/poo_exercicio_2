package poo.sca;

public class Professor {
	
	private int matricula;
	private String nome;
	
	public Professor(int _matricula, String _nome){
		this.matricula = _matricula;
		this.nome = _nome;
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	public String getNome(){
		return nome;
	}

}
