package exercicios;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Vivi");
		p1.setIdade(25);
		
		String exibirNome = p1.getNome();
		int exibirIdade = p1.getIdade();
		
		System.out.printf("Nome: %s| Idade: %d", exibirNome, exibirIdade);
		
	}
}
