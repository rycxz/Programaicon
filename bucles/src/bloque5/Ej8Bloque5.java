package bloque5;

import java.util.Scanner;

public class Ej8Bloque5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int car = 90;
		
		for( int i= 65 ; i<=car ;i++) {
			if( i== 'N') {
				System.out.println("Ñ");
			}
			char  car1 = (char) i;
			System.out.println( car1);
			

		}
		
		
		
		
		
		
		input.close();
	}

}
