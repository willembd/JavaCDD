package encapsulamento;

public class TesteNumeros {
	public static void main(String[] args) {
		Numeros n1 = new Numeros();
		n1.ajustaNum(10);
		int valor = n1.lerNum();
		System.out.println(valor);
	}
}
