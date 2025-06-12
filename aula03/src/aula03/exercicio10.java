package aula03;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		int array1[] = new int[4];
		int array2[] = new int[4];
		int array3[] = new int[4];
		int array4[] = new int[4];
		
		Scanner entrada = new Scanner(System.in);
		
		int tamanho = array1.length;
		for(int x=1; x<tamanho+1; x++) {
			System.out.println("Digite o "+x+" número do array1: ");
			array1[x] = entrada.nextInt(); 
			System.out.println("Digite o "+x+" número do array2: ");
			array2[x] = entrada.nextInt(); 
			System.out.println("Digite o "+x+" número do array3: ");
			array3[x] = entrada.nextInt(); 
			System.out.println("Digite o "+x+" número do array4: ");
			array4[x] = entrada.nextInt(); 
			
		}
		for(int y = 0; y<tamanho; y++) {
			System.out.println(array1[y]);
		}
		
	}
}
