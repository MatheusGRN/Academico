package br.edu.ifpb.esp.poo.academico;

import java.util.List;

public class Turma {

	
	private int tumaId;
	private int ano;
	private List<Aluno> alunos;
	private List<Professor> professores;
	public int getTumaId() {
		return tumaId;
	}
	public void setTumaId(int tumaId) {
		this.tumaId = tumaId;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
	
}
