package encapsulamento;

public class TestePet {
	public static void main(String[] args) {
		Pet p1 = new Pet();
		p1.ajustaNome("Mayara");
		p1.ajustaIdade(10);
		p1.ajustaTipo("Gata");
		p1.ajustaRaca("Siamês");
		
		String exibirNome = p1.lerNome();
		int exibirIdade = p1.lerIdade();
		String exibirTipo = p1.lerTipo();
		String exibirRaca = p1.lerRaca();		
		
		System.out.printf("Nome: %s | Idade: %d | Tipo: %s | Raça: %s", exibirNome, exibirIdade, exibirTipo, exibirRaca);
		
	}
}
