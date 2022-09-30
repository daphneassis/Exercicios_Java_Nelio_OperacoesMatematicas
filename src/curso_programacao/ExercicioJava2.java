package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava2 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	double raio;
	double p= 3.14159;
	double area;
	raio=sc.nextDouble();
	raio=Math.pow(raio, 2);
	area=raio*p;
	System.out.printf("A= %.4f%n", area);
	sc.close();
	}

}
