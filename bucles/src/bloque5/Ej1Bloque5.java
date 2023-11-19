package bloque5;

import java.util.Scanner;

public class Ej1Bloque5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su numero ");
		int numero = input.nextInt();
		for(int i = 0 ; i<=numero ; i++) {
		System.out.println("Su numero es: " + i);
		}
		System.out.println("Ejemplo 2-");
		for(int i = 0 ; i<=numero ; i++) {
			System.out.print("Su numero es: " + i + " ");
			}
			
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
