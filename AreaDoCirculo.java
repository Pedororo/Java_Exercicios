package funcoes_matematica;
import java.util.Locale;
import java.util.Scanner;
public class exercicio2_matematica {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, resultado;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		raio = Math.pow(raio, 2);
		
		resultado = (raio*pi);
		
		System.out.printf("O resultado é %.4f%n ", resultado);
		
		
		
		sc.close();
	}

}
