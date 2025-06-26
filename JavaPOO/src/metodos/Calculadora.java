package metodos;

public class Calculadora {
	public static void main(String[] args) {
		CalcularMetodos n1 = new CalcularMetodos();
		int resulsoma1 = n1.somar(5, 8);
		int resulsoma2 = n1.somar(5, 10, 7);
		int resulsub1 = n1.subtrair(18,7);
		int resulsub2 = n1.subtrair(45, 18, 4);
		
		System.out.println("Soma a + b = " + resulsoma1);
		System.out.println("Soma (a + b) + c = "+resulsoma2);
		System.out.println(resulsub1);
		System.out.println(resulsub2);
		
	}
}
