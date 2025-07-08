package encapsulamento;

public class TesteRetangulo {
	public static void main(String[] args) {
		Retangulo re = new Retangulo(4,2);
		
		double area = re.calcularArea();
		double perimetro = re.calcularPerimetro();
		
		System.out.println(perimetro);
		
	}
}
