package ejdowhile;
import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su la cantidad de sueldos que va a pedir"); 
		int cantidadSueldos =input.nextInt(); ;
		int numCont = 0;
		double sueldo = 0 ;
		do {
			System.out.println("Digame su sueldo: ");
			double numSue = input.nextDouble();
			System.out.println("Su sueldo es" +  numSue );
			if(numSue < sueldo) {
				System.out.println(numSue + "Es el mas alto");
				sueldo = numSue;
			}
			numCont ++;	
		}
		while(numCont < cantidadSueldos);
		
		input.close();

	}

}
