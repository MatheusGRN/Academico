package br.edu.ifpb.esp.poo.academico;

import java.util.Calendar;

public class Aluno {

	
	private long alunoId;
	private String matricula;
	private String nome;
	private Calendar dataDeNascimento;
	public long getAlunoId() {
		return alunoId;
	}
	public void setAlunoId(long alunoId) {
		this.alunoId = alunoId;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
}
