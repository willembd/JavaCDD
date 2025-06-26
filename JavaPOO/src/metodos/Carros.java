package metodos;

public class Carros {
	String modelo;
	String cor;
	double preco;
	
	public Carros() {
		
	}
	public Carros(String modelo){
		this.modelo=modelo;
	}
	public Carros(String modelo, double preco){
		this.modelo=modelo;
		this.preco=preco;
	}
	public Carros(String modelo, double preco, String cor){
		this.modelo=modelo;
		this.preco=preco;
		this.cor=cor;
	}
	
}
