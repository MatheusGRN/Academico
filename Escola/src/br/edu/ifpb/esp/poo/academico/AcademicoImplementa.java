package br.edu.ifpb.esp.poo.academico;

import java.util.ArrayList;

public class AcademicoImplementa implements AcademicoInterface {

	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	@Override
	public void adicionarDisciplina(String nome) {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		disciplinas.add(disciplina);
		
	}

	@Override
	public void adicionarProfessor(String matricula, String nome) {
		Professor professor = new Professor();
		professor.setMatricula(matricula);
		professor.setNome(nome);
		professores.add(professor);
	}

	@Override
	public void adicionarAluno(String matricula, String nome) {
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		alunos.add(aluno);
		
	}

	@Override
	public void adicionarTurma(Professor[] profs, Disciplina d, Aluno[] alunos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Turma[] listarTurmas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Turma[] listarTurmas(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

}
