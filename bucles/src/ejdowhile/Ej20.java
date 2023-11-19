package ejdowhile;
import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su cadena.");
		String cad= input.nextLine();
		System.out.println("Digame su caracter: ");
		char car = input.nextLine().charAt(0);
		int num;
		int num1 = cad.length();
		int numContador = 0;
		
		
		
		//con el for
		for(int i = 0;i<num1;i++) {
			if(cad.charAt(i)==car) {
				numContador ++;
				
			}
			System.out.println("su caracter aparace" + numContador);
		}
		
		input.close();
	}

}
