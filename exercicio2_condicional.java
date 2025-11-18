package estrutura_condicional;

import java.util.Scanner;

public class exercicio2_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		int numero;
		
		numero= sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
		
		sc.close();
	}

}
