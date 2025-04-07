package vetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] vetor = {1, 2, 3, 4, 5};

        // Exibindo o vetor original
        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Realizando a rotação para a direita 
        int ultimo = vetor[vetor.length - 1]; // Armazenando o último elemento
        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1]; // Deslocando os elementos para a direita
        }
        vetor[0] = ultimo; // Colocando o último elemento na primeira posição

        // Exibindo o vetor após a rotação
        System.out.println("\nVetor após a rotação para a direita:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
