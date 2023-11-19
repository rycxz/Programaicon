package ejdowhile;
import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		for(int i = 0; i<=10;i++) {
			System.out.println("Digame su numero: ");
			int numIn = input.nextInt();
			if(numIn<0) {
				num  ++;
				
			}
			else {
			System.out.println("No ha introducio ninguno negativo");
			}
			
			
		}
		System.out.println("Su numero es negativo " + num);
		input.close();

	}

}
