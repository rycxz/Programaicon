package ejdowhile;
import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su numero: ");
		int num = input.nextInt();
		for(int i = 1 ; i<num;i++) {
			double numDiv = num%i;
			if(numDiv == 0) {
				System.out.println("Su numero es divisible por " + i);
			}
		}
		input.close();

	}

}
