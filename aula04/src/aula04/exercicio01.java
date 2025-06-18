package aula04;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		float notas[] = new float[5];
		float media, soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int x=0; x<notas.length; x++) {
			System.out.printf("Digita a nota do %d Aluno", x+1);
			notas[x] = entrada.nextFloat();
			
		}
		for(double nota : notas) {
			soma+=nota;
		}
		media = soma / 5;
		System.out.println("A média dos Alunos é "+media+"");
	}
}
