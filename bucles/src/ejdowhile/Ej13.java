package ejdowhile;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("sigame su base");
		int numBase = input.nextInt();
		System.out.println("Digame su exponenet");
		int numExp = input.nextInt();
		int num = 1;
		for(int i = 0; i <numExp;i++) {
			System.out.println(num);
			num =  num * numBase;
			System.out.println(num);
		}
		
		
		
		
		input.close();

	}

}
