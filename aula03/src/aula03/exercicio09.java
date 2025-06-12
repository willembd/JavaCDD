package aula03;

public class exercicio09 {
	public static void main(String[] args) {
		int num[] = {1,3,6,7,8};
		int num2[] = new int[10];
		num[2]=35;
		
		int tamanho = num.length;
		
		for(int x=0; x<tamanho; x++) {
			System.out.println(num[x]);
		}
	}
}
