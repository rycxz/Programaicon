package ejdowhile;
import java.util.Scanner;

public class Ej38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double numRan = Math.random()*100; 
		int numRan1 = (int)numRan;
		
		double num ;
		do {
			System.out.println("Digame su numero");
		num = input.nextDouble();
		if(num == numRan1) {
			System.out.println("Ha adivinado el numero");
		}
		if(num<numRan1) {
			System.out.println("Mayor");
		}
		if(num>numRan1) {
			System.out.println("Menor");
		}
		}
		while(num != numRan1);
		
		
		input.close();

	}

}
