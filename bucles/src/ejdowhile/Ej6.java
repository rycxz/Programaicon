package ejdowhile;

import java.util.Scanner;


public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int cifras = 0;
		while(num>0) {
			  num=num/10;
			
			cifras=cifras + 1;
			
		}
		System.out.println(cifras);
		
		
		
		
		
		
		
		input.close();
	}

}