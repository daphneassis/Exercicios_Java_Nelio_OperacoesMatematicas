package curso_programacao;

import java.util.Scanner;

public class Modelo {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		double conta;
		System.out.println("qual o seu nome?");
		nome=scan.next();
		System.out.println("quantos anos ela tem?");
		idade= scan.nextInt();
		System.out.println("quanto vc tem na sua conta bancaria?");
		conta =scan.nextDouble();
		System.out.printf("Ela se chama %s, tem %d anos e na sua conta tem %.2f",nome,idade, conta);	
		scan.close();
 
	}

}
