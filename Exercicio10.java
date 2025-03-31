package vetores;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double vetor[] = new double[6] ;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite sua nota: ");
			vetor[i] = sc.nextDouble();
		}
		
		double media = (vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5]) / 6;
		
		System.out.print("Notas: ");
		for (int i = 0; i < vetor.length; i++) { //comando para mostrar todas as variáveis do vetor
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\nMédia: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		sc.close();
		
	}
}
