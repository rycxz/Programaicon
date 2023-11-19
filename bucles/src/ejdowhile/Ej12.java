package ejdowhile;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int menuOp = 0;
		do {
			System.out.println("Digame su opcion:");
			System.out.println("1 – Opción 1");
			System.out.println("2 – Opción 2");
			System.out.println("3 – Salir.");
			int numOp = input.nextInt();
			switch(numOp) {
			case 1:
				System.out.println("Opcion 1");
				break;
			case 2:
				System.out.println("Opcion 2");
				break;
			case 3:
				System.out.println("salir");
				break;
			}
			
		}
		while(menuOp<3);
		input.close();

	}

}
