package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava4 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	int numF,horast;
	double valor_hora,salario;
	numF=sc.nextInt();
	horast=sc.nextInt();
	valor_hora= sc.nextDouble();
	salario= horast*valor_hora;
	System.out.println("NUMBER ="+numF);
	System.out.printf("SALARY= U$ %.2f%n",salario);
	sc.close();
	}

}
