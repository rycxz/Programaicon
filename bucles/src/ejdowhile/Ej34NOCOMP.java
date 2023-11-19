package ejdowhile;
import java.util.Scanner;

public class Ej34NOCOMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numRest = 1;
		int numRe = 0;
		do {
			System.out.println("Digame su numero");
			double num = input.nextDouble();
			for (int i = 1; i <= num; i++) {

				double numDiv = num % i;
				if (numDiv == 0) {}}

					numRe++;

				

			
			if (numRe == 2 && numRe < 3) {
				System.out.println("Su numero es primo");
			}

		} while (numRest == 0);
		input.close();

	}

}
