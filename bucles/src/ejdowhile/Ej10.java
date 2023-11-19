package ejdowhile;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double suma = 0;
		for(int i = 0;i<=10;i++) {
		
			double num = input.nextInt();
			System.out.println(num);
			System.out.println(i);
			 suma = suma + num;
			System.out.println(suma);
		}
		input.close();
 
					
	}

}
