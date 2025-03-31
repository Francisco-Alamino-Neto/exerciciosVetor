package vetores;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vetor[] = new int[5] ;
		
//		System.out.print("Digite um número: ");
//		vetor[0] = sc.nextInt();
//		
//		System.out.print("Digite um número: ");
//		vetor[1] = sc.nextInt();
//		
//		System.out.print("Digite um número: ");
//		vetor[2] = sc.nextInt();
//		
//		System.out.print("Digite um número: ");
//		vetor[3] = sc.nextInt();
//		
//		System.out.print("Digite um número: ");
//		vetor[4] = sc.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Números armazenados: ");
		for (int i = 0; i < vetor.length; i++) { //comando para mostrar todas as variáveis do vetor
			System.out.print(vetor[i] + " ");
			
		}	
	}
}
