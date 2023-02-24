package calc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		
		Operacion calculo = new Operacion();

		System.out.println("Introduce un número");
		n1 = sc.nextInt();
		calculo.setA(n1);
		System.out.println("Introduce un número");
		n2 = sc.nextInt();
		calculo.setB(n2);

		System.out.println(n1 + " + " + n2 + " = " + calculo.suma());
		System.out.println(n1 + " - " + n2 + " = " + calculo.resta());
	}

}
