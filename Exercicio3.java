package vetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[8];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Leitura dos 10 números
        System.out.println("Digite 8 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        // Exibição dos números armazenados
        System.out.print("Números armazenados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Determinação do maior e menor número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Exibição do maior e menor número
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}