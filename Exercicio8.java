package vetores;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Criando dois vetores de 5 números cada
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        // Leitura dos 5 números para o vetor A
        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = sc.nextInt();
        }

        // Leitura dos 5 números para o vetor B
        System.out.println("Digite 5 números para o vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = sc.nextInt();
        }

        // Exibindo os vetores A e B
        System.out.print("Vetor A: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        // Comparando os vetores e exibindo os números iguais nas mesmas posições
        System.out.println("Números iguais nas mesmas posições:");
        for (int i = 0; i < 5; i++) {
            if (vetorA[i] == vetorB[i]) {
                System.out.println("Posição " + (i + 1) + ": " + vetorA[i]);
            }
        }

        sc.close();
    }
}
