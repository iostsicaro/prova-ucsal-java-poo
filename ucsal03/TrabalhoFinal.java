package ucsal03;

/* Crie uma classe TrabalhoFinal 
 * contendo Professor, vetor de Alunos 
 * (5 alunos), titulo do Trabalho de 
 * Conclusão de Curso */
public class TrabalhoFinal {

	private Professor professor;
	private Aluno[] alunos;
	private String titulo;
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
