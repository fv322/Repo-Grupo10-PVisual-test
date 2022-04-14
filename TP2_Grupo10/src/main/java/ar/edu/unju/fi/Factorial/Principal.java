package ar.edu.unju.fi.Factorial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Ingrese numero: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();

		int aux = 1;
		if ((numero >= 0) && (numero <= 10)) {
			for (int i = 1; i <= numero; i++) {
				aux *= i;
			}

			System.out.println("El factorial de " + numero + " es " + aux);
		} else {
			System.out.println(" El numero ingresado esta fuera del rango permitido");

		}
		entrada.close();
		

	}

}
