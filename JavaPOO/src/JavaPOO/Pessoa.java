package JavaPOO;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	String genero;
	
	public void comer(String comida) {
		System.out.printf("%s Começou a comer %s \n", nome, comida);
	}
	public void exibir() {
		System.out.printf("%s tem %d anos, com a altura de %f e tem o genero %s \n", nome, idade, altura, genero);
	}
}
