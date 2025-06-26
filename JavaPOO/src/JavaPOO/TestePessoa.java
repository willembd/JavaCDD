package JavaPOO;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
	
		
		/*p1.nome="Bia";
		p1.comer("Coxinha");
		
		p2.nome="Lais";
		p2.comer("Coco");*/
		
		p3.nome="Marcos";
		p3.idade=25;
		p3.altura=1.8;
		p3.genero="Masculino";
		p3.exibir();
		
		p4.nome="Fernanda";
		p4.idade=22;
		p4.altura=1.6;
		p4.genero="Feminino";
		p4.exibir();
		
		
	}
}
