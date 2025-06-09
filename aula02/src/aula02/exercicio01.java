package aula02;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = entrada.nextInt();
		
		/*if (num > 0) {
			System.out.println("Número Positivo");
		}else if(num<0) {
			System.out.println("Número Negativo");
		}else {
			System.out.println("Número 0");
		} */
		
		String resultado = num>0?"Positivo" : num<0?"Negativo" : "Zero";
		System.out.println(resultado);
	}
}
