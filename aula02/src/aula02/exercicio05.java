package aula02;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = entrada.next().charAt(0);
		
		String resp = letra == 'F' || letra == 'f' ? "Feminino" : letra == 'M' || letra == 'm' ? "Masculino" : "Letra Invalida!!";
		
		System.out.println(resp);
		
	}
}
