package ejdowhile;
import java.util.Scanner;

public class Ej31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su numero");
		int numPer = input.nextInt();
		int numCon = 0;
		for(int i = 1; i<numPer;i++) {
			double numDiv = numPer%i;
			if(numDiv == 0) {
				numCon = numCon + i;
				System.out.println("Es divisble por " + i );
			}
		
		}
		if(numCon == numPer) {
			System.out.println("Su numero es perfecto");
		}
		else {
			
		}
		
		input.close();

	}

}
