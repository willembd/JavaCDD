package metodos;

public class Concessionaria {
	public static void main(String[] args) {
		Carros c1 = new Carros();
		Carros c2 = new Carros("Fiat");
		Carros c3 = new Carros("Fiat", 50.000);
		Carros c4 = new Carros("Fiat", 50.000, "Vermelho");
		
		System.out.println(c3.modelo + c3.preco);
	}
}
