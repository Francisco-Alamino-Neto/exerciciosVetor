package revisao;

public class ExerciciosRevisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gastosDiarios = {50, 50, 50.54, 50, 200, 114.56, 150};
		double total = 0;
		
		for (int i = 0; i < gastosDiarios.length; i++) { //comando para mostrar todas as variáveis do vetor começando pelo primeiro
			System.out.println("Gasto diário: " + gastosDiarios[i] + " ");
			total += gastosDiarios[i];
		}
		
		System.out.printf("\nGasto total: %.2f", total);
		double gastoMedio = total / gastosDiarios.length;
		System.out.printf("\nGasto médio diário: %.2f", gastoMedio);
		
	}

}
