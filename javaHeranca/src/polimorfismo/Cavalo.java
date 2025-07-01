package polimorfismo;

public class Cavalo extends Animal{
	public Cavalo(String nome) {
		super(nome);
	}
	public void Comer(String comida) {
		System.out.printf("Esta comendo %s", comida);
	}
	public void Comer(String estado, String comida) {
		System.out.printf("%s foi comer %s e ficou %s", nome, comida, estado);
	}
}
