package bloque5;

import java.util.Scanner;

public class Ej2BloqueBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su numero: ");
		int numero0 = input.nextInt();
		System.out.println("Digame su segundo  numero: ");
		int numero1 = input.nextInt();
		for (int i = numero0 ; i<= numero1 ; i++) {
			System.out.println("Su nuemro es: " + i);
		}
		for (int i = numero0 ; i<= numero1 ; i++) {
			System.out.print("Su nuemro es: " + i + " ");
		}

			input.close();

	}

}
