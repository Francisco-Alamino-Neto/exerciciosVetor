package vetores;

import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vetor[] = new int[10] ;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número entre 1 e 100: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Números armazenados: ");
		for (int i = 0; i < vetor.length; i++) { //comando para mostrar todas as variáveis do vetor
			System.out.print(vetor[i] + " ");
			
		}
		
		int somaTotal = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7] + vetor[8] + vetor[9];
		System.out.println("\nSoma total: " + somaTotal); // "/n" pula linha
		
	}
}
