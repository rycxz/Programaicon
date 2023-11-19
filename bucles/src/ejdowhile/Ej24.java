package ejdowhile;
import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame el largo");
		int numLargo = input.nextInt();
		System.out.println("Digame el ancho");
		int numAncho = input.nextInt();
		for(int i = 0; i<numAncho;i++) {
			for(int j = 0;j<numLargo;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		input.close();

	}

}
