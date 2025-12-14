package funcoes_matematica;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5_matematica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// np = numero de peças, vu = valor unitário.
		int cod1, cod2, np1, np2;
		double vu1, vu2, resultado;

		cod1 = sc.nextInt();
		np1 = sc.nextInt();
		vu1 = sc.nextDouble();
		cod2 = sc.nextInt();
		np2 = sc.nextInt();
		vu2 = sc.nextDouble();

		resultado = (np1 * vu1 + np2 * vu2);
		System.out.printf("O valor a ser pago é %.2f%n", resultado);

		sc.close();
	}

}
