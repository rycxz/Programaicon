package ejdowhile;
import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numMa = 0;
		int numIn;
		int numMe = 0;
		int numCon = 0;
		do {
			System.out.println("Digame su numero mayor de 0"
					+ "");
			 numIn = input.nextInt();
			
			 if(numIn>numMa) {
				numMa = numIn; 
			 }
			 else if ( numMa >numMe && numIn != 0) {
				 numMe = numIn; 
				 
			 }
			 numCon++;
			 
			
		}
		while(numIn != 0);
		System.out.println("Su numero mayor es " + numMa);
		System.out.println("Su numero menos es " + numMe);
		System.out.println("Ha leido " + numCon + " numeros.");
		input.close();

	}

}
