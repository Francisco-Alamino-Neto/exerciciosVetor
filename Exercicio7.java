package vetores;

import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vetor[] = new int[5] ;
		int multiplicador;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Vetor original: ");
		for (int i = 0; i < vetor.length; i++) { //comando para mostrar todas as variáveis do vetor
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nDigite um número para multiplicar: ");
		multiplicador = sc.nextInt();
		
		System.out.print("Vetor multiplicado: ");
		for (int i = 0; i < vetor.length; i++) { //comando para mostrar todas as variáveis do vetor multiplicado
			System.out.print(vetor[i] * multiplicador + " ");
		}
	}
}
