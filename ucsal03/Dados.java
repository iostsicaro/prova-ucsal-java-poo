package ucsal03;

public class Dados {

	/* Criar um método na mesma classe 
	 * Dados e para retornar o TrabalhoFinal 
	 * com os dados */
	public TrabalhoFinal obterTCC() {
		TrabalhoFinal tf = new TrabalhoFinal();
		tf.setProfessor(obterProfessor());
		tf.setAlunos(obterAlunos());
		tf.setTitulo("Titulo do Trabalho Final");
		return tf;
	}
	
	/* Criar um método em uma 
	 * classe Dados para retornar 
	 * um vetor contendo 5 alunos. */	
	public Aluno[] obterAlunos() {
		Aluno[] alunos = new Aluno[5];
		Aluno aln;
		
		for (int i = 0; i < alunos.length; i++) {
			aln = new Aluno();
			aln.setMatricula("0000" + (i+1) + "1");
			aln.setNome("Aluno0" + (i+1));
			alunos[i] = aln;
		}

//		aln = new Aluno();
//		aln.setMatricula("000011");
//		aln.setNome("Aluno01");
//		alunos[0] = aln;
//		
//		aln = new Aluno();
//		aln.setMatricula("000021");
//		aln.setNome("Aluno02");
//		alunos[1] = aln;
//		
//		aln = new Aluno();
//		aln.setMatricula("000031");
//		aln.setNome("Aluno03");
//		alunos[2] = aln;
//		
//		aln = new Aluno();
//		aln.setMatricula("000041");
//		aln.setNome("Aluno04");
//		alunos[3] = aln;
//		
//		aln = new Aluno();
//		aln.setMatricula("000051");
//		aln.setNome("Aluno05");
//		alunos[4] = aln;
		
		return alunos;
	}

	/* Cria o professor */
	public Professor obterProfessor() {
		Professor prof = new Professor();
		prof.setNome("Professor1");
		prof.setDepartamento(obterDepartamento());
		return prof;
	}
	
	/* Cria o departamento */
	public Departamento obterDepartamento() {
		Departamento dep = new Departamento();
		dep.setDescricao("Informatica");
		return dep;
	}
}




