package aula03;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		int x=1;
		float soma = 0;
		float media = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Quantos Alunos tem na sala: ");
		int quant = entrada.nextInt();
		
		while (x <= quant) {
			System.out.println("Digite a nota do Aluno "+x+" :");
			float nota = entrada.nextFloat();
			
			soma = nota + soma;
			++x;
		}
		media = soma / quant;
		
		System.out.println("A média dos alunos é: "+media+"");
		
	}
}
