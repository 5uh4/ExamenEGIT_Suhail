package examenEGit;

import java.util.Scanner;

public class ExamenEgit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dame un valor");
		int valor1 = s.nextInt();
		System.out.println("Dame el segundo valor");
		int valor2 = s.nextInt();
		System.out.println("Elige el calculo a realizar: ");
		System.out.println("1. Suma\n2. Resta\n3. Multiplicaci�n\n4. Divisi�n.");
		int opc = s.nextInt();
		switch (opc) {
		case 1: {
			System.out.println("El resultado de la suma es: " + (valor1 + valor2));
			break;
		}
		case 2: {
			System.out.println("El resultado de la resta es: " + (valor1 - valor2));
		}
		case 3: {
			System.out.println("El resultado de la multiplicacion es: " + (valor1 * valor2));
		}
		case 4: {
			System.out.println("El resultado de la divisi�n es: " + (valor1 / valor2));
		}
		}
		s.close();
	}

}
