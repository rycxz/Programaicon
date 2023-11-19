package ejdowhile;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("digame su numero: ");
		int num = input.nextInt();
		do {
			num--;
			System.out.println("su numero es: "+ num);
		}
		while(num>0);
		
		
		System.out.println("digame su numero: ");
		int num1 = input.nextInt();
		do {
			num1--;
			System.out.print("su numero es: "+ num + " ");
		}
		while(num1>0);
		
		
		
		
		input.close();

	}

}
