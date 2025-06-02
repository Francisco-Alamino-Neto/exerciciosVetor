package vetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[15];
		int par = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.print("Vetor: ");
		for (int i = 0; i < vetor.length; i++) { // comando para mostrar todas as variáveis do vetor

			if (vetor[i] % 2 == 0) { // % = MMC, conhecido como módulo em java.
				par = par + 1; //Sempre que um número for par, irá somar +1 ao contador
			}
			
		}
		
		System.out.print(par);
		sc.close();

	}
}
