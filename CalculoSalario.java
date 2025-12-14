package funcoes_matematica;
import java.util.Locale;
import java.util.Scanner;
public class exercicio4_matematica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroFuncionario, horaTrabalhada;
		double salario, valorPorHora;
		
		numeroFuncionario = sc.nextInt();
		horaTrabalhada = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = (horaTrabalhada*valorPorHora);
		
		System.out.printf("Numero do funcionário= %d%n", numeroFuncionario);
		System.out.printf("Salário = U$ %.2f%n", salario);
		
		sc.close();

	}

}
