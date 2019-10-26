package br.edu.ifpb.esp.poo.academico;
  
import java.util.List;

public class Disciplina {

	private int disciplina_Id;
	private List<Turma> turmas;
	private String nome;
	public int getDisciplina_Id() {
		return disciplina_Id;
	}
	public void setDisciplina_Id(int disciplina_Id) {
		this.disciplina_Id = disciplina_Id;
	}
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
