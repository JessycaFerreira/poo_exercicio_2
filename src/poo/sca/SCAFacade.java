package poo.sca;

import java.util.Iterator;

import poo.sca.io.SCAPersistencia;
import poo.sca.io.SCAPersistenciaException;

public class SCAFacade {

	
	private SCAPersistencia persistencia;

	
	public Turma criarTurma(String periodo, Disciplina disciplina, int numero) 
			throws SCAException, SCARuntimeException, SCAPersistenciaException {		
		return persistencia.salvar(new Turma(disciplina, numero, periodo));		
	}
	
	
	public Turma getTurma(String periodo, int codDisciplina, int numero) 
			throws SCARuntimeException, SCAPersistenciaException {		
		return persistencia.recuperarTurma(periodo, codDisciplina, numero);
	}
	
	public Turma removerTurma(String periodo, int codDisciplina, int numero) 
			throws SCAException, SCARuntimeException, SCAPersistenciaException {
		return persistencia.removerTurma(periodo, codDisciplina, numero);
	}
	
	public Iterator<Turma> getTurmasIterator() 
			throws SCARuntimeException, SCAPersistenciaException {		
		return persistencia.recuperarTurmas().iterator();
	}
	
	public Disciplina criarDisciplina(String nome, int codigo)
			throws SCAException, SCARuntimeException, SCAPersistenciaException {		
		return persistencia.salvar(new Disciplina(codigo, nome));
	}
	
	public Iterator<Disciplina> getDisciplinasIterator()
			throws SCARuntimeException, SCAPersistenciaException {		
		return persistencia.recuperarDisciplinas().iterator();
	}
	
	
	public Curso criarCurso(String nome, int codigo)
			throws SCAException, SCARuntimeException, SCAPersistenciaException {		
		return persistencia.salvarCurso(new Curso(codigo, nome));
	}
	
	public Iterator<Curso> getCursosIterator()
			throws SCARuntimeException, SCAPersistenciaException {
		return persistencia.recuperarCursos().iterator();
	}
	
	public Professor criarProfessor(String nome, int matricula)
			throws SCAException, SCARuntimeException, SCAPersistenciaException {
		return persistencia.salvarProfessor(new Professor(matricula, nome));
	}
	
	public Iterator<Professor> getProfessoresIterator()
			throws SCARuntimeException, SCAPersistenciaException {	
		return persistencia.recuperarProfessores().iterator();		
	}
	
	public Disciplina getDisciplina(int codigo)
			throws SCARuntimeException, SCAPersistenciaException {		
		return persistencia.recuperarDisciplina(codigo);
	}
		
}
