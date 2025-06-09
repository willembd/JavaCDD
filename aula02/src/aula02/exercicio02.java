package aula02;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo Número: ");
		int num2 = entrada.nextInt();
		System.out.println("Digite o terceiro Número: ");
		int num3 = entrada.nextInt();
		
		int maior = Math.max(num1, Math.max(num2, num3));
		System.out.println(maior);
		
		/*String resposta = num1>num2 && num1>num3 ?"O primeiro número "+num1+" é o maior" : num2>num1 && num2>num3?"O segundo número "+num2+" é o maior"
				: "O terceiro número "+num3+" é o maior";
		System.out.println(resposta);*/
	}
}
