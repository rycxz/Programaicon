package ejdowhile;
import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean cadCom = true;;
		
		do {
			System.out.println("Digame sus grados centígrados");
			double grados = input.nextDouble();
			double hel = grados + 273;
			System.out.println("Su grados son " + hel + " kelvin");
			input.nextLine();
			
			System.out.println("Quiere repetir el proceso?");
			String cad = input.nextLine();
			char cadRep = cad.charAt(0);
		
			
			if(cadRep == 'S') {
				cadCom = true;
				
			}
			else if (cadRep == 'N') {
				cadCom = false;
			}
			
			
		}
		while(cadCom == true);
		input.close();

	}

}
