package poo.sca;

public class Disciplina {
	
	private int codigo;
	private String nome;
	
	public Disciplina(int _codigo, String _nome){
		this.codigo = _codigo;
		this.nome = _nome;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public String getNome(){
		return nome;
	}

}
