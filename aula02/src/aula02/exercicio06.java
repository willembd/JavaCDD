package aula02;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		System.out.println("Telefonou para a vítima S=sim | N=não : ");
		char op = entrada.next().charAt(0);
		cont = op == 'S' || op =='s' ? ++cont : cont ; 
		
		System.out.println("Esteve no local do crime S=sim | N=não : ");
		char op2 = entrada.next().charAt(0);
		cont = op2 == 'S' || op2 =='s' ? ++cont : cont ; 
		
		System.out.println("Mora perto da vítima S=sim | N=não : ");
		char op3 = entrada.next().charAt(0);
		cont = op3 == 'S' || op3 =='s' ? ++cont : cont; 
		
		System.out.println("Devia para a vítima S=sim | N=não : ");
		char op4 = entrada.next().charAt(0);
		cont = op4 == 'S' || op4 =='s' ? ++cont : cont ; 
	
		System.out.println("Já trabalhou com a vítima S=sim | N=não : ");
		char op5 = entrada.next().charAt(0);
		cont = op5 == 'S' || op5 =='s' ? ++cont : cont ; 
	
		String resposta = cont == 2 ? "Suspeita" : cont == 3 || cont == 4 ? "Cúmmplice" : cont == 5 ? "Assassino" : "Inocente";
		
		System.out.println(resposta);
	}
}
