package aula03;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		float soma=0, media=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos Alunos tem:");
		int qtn = entrada.nextInt();
		
		for(int i=1; i<=qtn; i++) {
			System.out.println("Digite a nota do "+i+" aluno: ");
			soma += entrada.nextFloat();
			
		}
		media = soma/qtn;
		System.out.println("A média dos alunos é: "+media+" ");
	}
}
