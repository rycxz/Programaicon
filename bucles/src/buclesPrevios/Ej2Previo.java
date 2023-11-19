package buclesPrevios;

import java.util.Scanner;

public class Ej2Previo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su numero");
		int numero = input.nextInt();
		for ( int i = 1; i<=10 ; i++) {
		System.out.println(numero + "x" +   i +  "=" +  numero * i);
		}
		
		
		
		
		
		
		
		input.close();
	}

}
