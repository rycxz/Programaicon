package ejdowhile;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cad = input.nextLine();
		int num = cad.length();
		for(int i = 0; i<num ;i++) {
			System.out.print(cad.charAt(i) + " ");
		}
		
		
		
		input.close();

	}

}
