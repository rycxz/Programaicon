package ejdowhile;
import java.util.Scanner;

public class Ej36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su cadena de texto");
		String cad = input.nextLine();
		int  num = cad.length();
		int numCont = 1;
		for (int i = 0; i<num ; i++) {
			char car = cad.charAt(i);
			if(car == ' ') {
				numCont++;
			}
		}
		System.out.println("Su cadena tiene " + numCont + " palabras");
		
		
		
		
		
		
		
		
		input.close();

	}

}
