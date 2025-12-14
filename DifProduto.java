package funcoes_matematica;
import java.util.Scanner;
public class exercicio3_matematica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, difproduto;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		difproduto = (a*b-c*d);
		
		System.out.println(difproduto);
		
		
		sc.close();
	}

}
