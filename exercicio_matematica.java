package funcoes_matematica;
import java.util.Scanner;
public class exercicio_matematica {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, resultado;
		
		x= sc.nextInt();
		y= sc.nextInt();
		
		resultado = (x+y);
		
		System.out.println(resultado);
		sc.close();
	};

}
