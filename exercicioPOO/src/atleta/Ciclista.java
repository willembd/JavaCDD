package atleta;

public class Ciclista extends Atleta{
	
	public Ciclista(String nome, int idade) {
		super(nome, idade);
	}
	
	public void pedalar() {
		System.out.println("O Atleta esta pedalando!!");
	}
	public void pararPedalar() {
		System.out.println("O Atleta parou de Pedalar!!");
	}
}
