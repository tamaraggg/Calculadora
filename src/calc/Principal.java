package calc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		char operac;
		char seguir = 'S';
		Operacion calculo = new Operacion();

		do {
			System.out.println("Introduce un número");
			n1 = sc.nextInt();
			calculo.setA(n1);
			System.out.println("Introduce un número");
			n2 = sc.nextInt();
			calculo.setB(n2);

			System.out.println(
					"¿Qué operación deseas realizar? + para sumar, - para restar, x para multiplicar, / para dividir");
			operac = sc.next().charAt(0);

			switch (operac) {
			case '+':
				System.out.println(n1 + " + " + n2 + " = " + calculo.suma());
				break;
			case '-':
				System.out.println(n1 + " - " + n2 + " = " + calculo.resta());
				break;
			case 'x':
				System.out.println(n1 + " x " + n2 + " = " + calculo.multiplicacion());
				break;
			case '/':
				System.out.println(n1 + " / " + n2 + " = " + calculo.divison());
				break;
			default:
				System.out.println("Error: caracter no válido");
				break;
			}

			System.out.println("¿Otra operación? S/N");
			seguir = sc.next().charAt(0);
			seguir = Character.toUpperCase(seguir);
		} while (seguir == 'S');
		System.out.println("Fin programa");

	}
}