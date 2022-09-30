package curso_programacao;

import java.util.Scanner;

public class ExercicioJava3 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int A, B, C, D,produtoAB, produtoCD,diferenca;
	A=sc.nextInt();
	B=sc.nextInt();
	C=sc.nextInt();
	D=sc.nextInt();
	produtoAB=A*B;
	produtoCD=C*D;
	diferenca= produtoAB - produtoCD;
	System.out.println("DIFERENCA="+diferenca);
	sc.close();
	}

}
