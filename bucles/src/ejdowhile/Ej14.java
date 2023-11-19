package ejdowhile;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame el volumen total en litros del depósito.");
		double vol = input.nextDouble();
		double lit = 0;
		do {
			System.out.println("Digame sus litos ");
			double vol1 = input.nextDouble();
			lit = lit + vol1;
			System.out.println(lit);
			if(lit<vol) {
				System.out.println(lit+ "litos faltan" + (vol - lit));
				
			}
		}
		while(lit<vol&&lit>0);
		input.close();
	}

}
