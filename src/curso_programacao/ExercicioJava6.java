package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double  A, B, C, area_tri_ret, area_circulo, pi,area_trapezio, area_quadrado, area_retangulo;
		pi=3.14159;
		A= sc.nextDouble();
		B= sc.nextDouble();
		C= sc.nextDouble();
		area_tri_ret= (A*C)/2;
		area_circulo=pi*Math.pow(C,2);
		area_trapezio= (A+B)*C/2;
		area_quadrado=B*B;
		area_retangulo=A*B;
		System.out.printf("TRIANGULO:%.3f%n",area_tri_ret);
		System.out.printf("CIRCULO:%.3f%n",area_circulo);
		System.out.printf("TRAPEZIO:%.3f%n",area_trapezio);
		System.out.printf("QUADRADO:%.3f%n",area_quadrado);
		System.out.printf("RETANGULO:%.3f%n",area_retangulo);
	}

}
