package ejdowhile;

import java.util.Scanner;

public class Ej13peroenSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("sigame su base");
		int numBase = input.nextInt();
		System.out.println("Digame als evsces que se quieres suamr");
		
		int num = 0;
		for(int i = 0; i <5;i++) {
			int numSum = input.nextInt();
			System.out.println(num);
			num =  num + numBase;
			System.out.println(num);
		}
		
		
		
		
		input.close();

	}

}
