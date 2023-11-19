package bloque5;

import java.util.Scanner;

public class Ej5Bloque5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su nuemro:");
		int num0 = input.nextInt();
		System.out.println("Digame su nuemro:");
		int num1 = input.nextInt();
		System.out.println("Digame su nuemro:");
		int num2 = input.nextInt();
		for(int i = num0; i<=num1 ; i= i + num2) {
			System.out.println("Su numero es: " + i);
		}
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
