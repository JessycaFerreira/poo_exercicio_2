package poo.sca.io;

import java.util.List;

import poo.sca.Curso;
import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.Turma;

public class SCAPersistenciaMemoria implements SCAPersistencia{

    private List<Turma> turmas;
    private List<Disciplina> disciplinas;
	private List<Professor> professores;
	private List<Curso> cursos;
	
	
	public Turma salvar(Turma turma) {
		if(turmas.contains(turma))
			return null;
		
		turmas.add(turma);
		return turma;
	}
	

	public List<Turma> recuperarTurmas() {
		
		return this.turmas;
	}

	public Disciplina salvar(Disciplina disciplina) {

		if(disciplinas.contains(disciplina))
			return null;
		
		disciplinas.add(disciplina);		
		return disciplina;
		
	}

	
	public List<Disciplina> recuperarDisciplinas() {
	
		return this.disciplinas;
	}

	
	public Professor salvarProfessor(Professor professor) {
	 
		if(disciplinas.contains(professor))
			return null;
		
		professores.add(professor);
		return professor;
	}
	
	
	public List<Professor> recuperarProfessores() {
		 
		return this.professores;
	}

	public Curso salvarCurso(Curso curso) {
		
		if(cursos.contains(curso))
			return null;
		
		cursos.add(curso);
		return curso;
		
	
	}

	public List<Curso> recuperarCursos() {
	 
		return this.cursos;
	}
	
	public Turma recuperarTurma(String periodo, int codDisciplina, int numero){
		
		return null;
	}
	
	public Turma removerTurma(String periodo, int codDisciplina, int numero){
		
		return null;
	}
	
	public Disciplina recuperarDisciplina(int codigo){
		return null;
	}

}
