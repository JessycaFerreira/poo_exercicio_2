package poo.sca;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Turma {
	
	private Disciplina disciplina;
	private List<Professor> professores = new Vector<Professor>();
	private String horario;
	private List<Curso> cursos = new Vector<Curso>();
	private int numero;
	private String periodo;
	
	public Turma(Disciplina _disciplina, int _numero, String _periodo){
		this.disciplina = _disciplina;
		this.numero = _numero;
		this.periodo = _periodo;
	}
	
	public void addProfessor(Professor professor){
		professores.add(professor);
		
	}
	
	public Iterator<Professor> getProfessoresIterator(){
		return professores.iterator();
		
	}
	
	public Iterator<Curso> getCursosIterator(){
		return cursos.iterator();
	}

}
