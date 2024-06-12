package ucsal03;

public class Impressao {
	
	public void imp(Aluno[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(
					v[i].getMatricula() 
					+ " " +
					v[i].getNome());
		}
	}
	
	public void imp(Professor prof) {
		System.out.println(
				prof.getNome()
				+ " " +
				prof.getDepartamento().getDescricao());
	}

	public void imp(Departamento dep) {
		System.out.println(dep.getDescricao());		
	}
	
	public void imp(TrabalhoFinal trabFinal) {
		System.out.println(
				trabFinal.getTitulo()
				+ ", Orientador: " +
				trabFinal.getProfessor().getNome());
	}

	public void imp(double d) {
		System.out.println(d);
	}
	
	public void imp(String d) {
		System.out.println(d);
	}
	
	public void imp(boolean d) {
		System.out.println(d);
	}
}
