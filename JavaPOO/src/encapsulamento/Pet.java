package encapsulamento;

public class Pet {
	private String nome;
	private int idade;
	private String tipo;
	private String raca;
	
	
	public void ajustaNome(String n) {
		this.nome=n;
	}
	public String lerNome() {
		return nome;
	}
	
	public void ajustaIdade(int i) {
		this.idade=i;
	}
	public int lerIdade() {
		return idade;
	}
	
	public void ajustaTipo(String t) {
		this.tipo=t;
	}
	public String lerTipo() {
		return tipo;
	}
	
	public void ajustaRaca(String r) {
		this.raca=r;
	}
	public String lerRaca() {
		return raca;
	}
	
}
