package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		int cd_peca1, num_pecas1, cd_peca2, num_pecas2;
		double valorun_peca1, valorun_peca2, valor_pago;
		cd_peca1=sc.nextInt();
		num_pecas1=sc.nextInt();
		valorun_peca1=sc.nextDouble();
		cd_peca2=sc.nextInt();
		num_pecas2=sc.nextInt();
		valorun_peca2=sc.nextDouble();
		valor_pago= (valorun_peca1*num_pecas1)+(valorun_peca2*num_pecas2);
		System.out.printf("VALOR A PAGAR:R$ %.2f%n", valor_pago);
		sc.close();
	}

}
