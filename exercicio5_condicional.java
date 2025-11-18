package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codItem, quantItem;
		double valorFinal;
		System.out.println("Digite o código do item e sua quantidade: ");
		codItem = sc.nextInt();
		quantItem = sc.nextInt();
		
		if (codItem == 1) 
			valorFinal = quantItem * 4.00;
		
		else if (codItem == 2) 
			valorFinal = quantItem * 4.50;
		
		else if (codItem == 3)
			valorFinal = quantItem * 5.00;
		
		else if (codItem == 4)
			valorFinal = quantItem * 2.00;
		
		else {
			valorFinal = quantItem * 1.50;
		}
		System.out.printf("O valor do seu pedido ficou por : R$ %.2f%n ", valorFinal);
		
		sc.close();
	}

}
