package bloque5;

import java.util.Scanner;

public class Ej7Bloque5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su numero: ");
		int numero = input.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Su numero es:" + i * numero );
		}

		input.close();
	}

}
