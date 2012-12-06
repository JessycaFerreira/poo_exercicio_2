package poo.sca.io;

import java.util.List;

import poo.sca.Curso;
import poo.sca.Disciplina;
import poo.sca.Professor;
import poo.sca.Turma;

public interface SCAPersistencia {
	
	public Turma salvar(Turma turma) throws SCAPersistenciaException;
	public List<Turma> recuperarTurmas() throws SCAPersistenciaException;
	public Disciplina salvar(Disciplina disciplina) throws SCAPersistenciaException;
	public List<Disciplina> recuperarDisciplinas() throws SCAPersistenciaException;
	public Professor salvarProfessor(Professor professor) throws SCAPersistenciaException;
	public List<Professor> recuperarProfessores() throws SCAPersistenciaException;
	public Curso salvarCurso(Curso curso) throws SCAPersistenciaException;
	public List<Curso> recuperarCursos() throws SCAPersistenciaException;
	public Turma recuperarTurma(String periodo, int codDisciplina, int numero) throws SCAPersistenciaException;
	public Turma removerTurma(String periodo, int codDisciplina, int numero) throws SCAPersistenciaException;
	public Disciplina recuperarDisciplina( int codigo) throws SCAPersistenciaException;
	
}
