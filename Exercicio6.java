package vetores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vetor[] = new int[6] ;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Vetor original: ");
		for (int i = 0; i < vetor.length; i++) { //comando para mostrar todas as variáveis do vetor
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nVetor invertido: ");
		for (int i = vetor.length -1; i >= 0; i--) { //comando para mostrar todas as variáveis do vetor começando pelo último
			System.out.print(vetor[i] + " ");
			
		}
	}
}
