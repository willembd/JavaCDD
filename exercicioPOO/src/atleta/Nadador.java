package atleta;

public class Nadador extends Atleta {
	
	public Nadador(String nome, int idade) {
	    super(nome, idade);
	}
	
	public void nadador() {
		System.out.println("O Atleta esta nadando!!");
	}
	public void pararNadar() {
		System.out.println("O Atleta parou de Nadar!!");
	}
}
