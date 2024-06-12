package ucsal03;

public class Executar {
	public static void main(String[] args) {
		Dados dados = new Dados();
		Impressao impressao = new Impressao();
		Impressao2 impressao2 = new Impressao2();
		
		impressao.imp(dados.obterAlunos());
		System.out.println();
		impressao.imp(dados.obterProfessor());
		System.out.println();
		impressao.imp(dados.obterTCC());
		System.out.println();
		impressao.imp(2.5);
		System.out.println();
		impressao.imp("Fernando Borges");
		System.out.println();
		impressao2.imp(dados.obterProfessor());
		
	}
}
