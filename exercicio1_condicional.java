package estrutura_condicional;

import java.util.Scanner;

public class exercicio1_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		int num;
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Numero negativo");
		}
		else {
			System.out.println("Numero positivo");
		}
		
		sc.close();
	}

}
