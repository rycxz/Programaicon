package ejdowhile;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("digame su numero");
		int num  ;
		int numFinal = 0;
		int numSuma = 0;
		do {
			
			 num = input.nextInt();
			numFinal++;
			System.out.println("Numeros leidos "+numFinal);
			numSuma = num + numSuma;
			System.out.println("Numeros sumados "+numSuma);
		}
		while(num!=0);
		input.close();

	}

}
