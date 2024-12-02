package classes;

import java.util.Date;

public class Aulas {
	private Integer id; 
	private Date inicio;
	private Date termino;
	private Alunos[] alunos;
	private Professor professor;
	private Curso curso;
	private Salas sala;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	public Alunos[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Alunos[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Salas getSala() {
		return sala;
	}
	public void setSala(Salas sala) {
		this.sala = sala;
	}
	public String cadastrar() {
		String msg = "As aulas "+id+" foram cadastradas";
		return msg;
	}
}
