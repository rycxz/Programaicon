package ejdowhile;
import java.util.Scanner;

public class Ej37 {

	final static int NUMVARUNO = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int div = 0;
		

		for (int i = 1; i < NUMVARUNO; i++) {
			div = 0;
			
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {

					div = j + div;

				}

			}
			if (i == div) {

			
				System.out.println(i);
			}

			
		}

		input.close();

	}

}
