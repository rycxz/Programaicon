package ejdowhile;

import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		double numMedia = 0;
		double num;
		int numCont = 0;
		do {
			System.out.println("digame su nota");
			 num = input.nextDouble();
			 
			 if(num<0) {
				 System.out.println("numero no valido");
			 }
			 else {
				 numMedia= num + numMedia;
				 numCont++;
			 }
			 
		}
		while(num>0);
		double notaMedia = numMedia/numCont;
		System.out.println("su nota media es" + notaMedia );
		input.close();

	}

}
