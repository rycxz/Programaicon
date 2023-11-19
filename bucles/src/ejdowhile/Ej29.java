package ejdowhile;
import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cadFin = "fin";
		String cad;
		boolean cadCom = true;
		int numVocA = 0;
		int numVocE = 0;
		int numVocI = 0;
		int numVocO = 0;
		int numVocU = 0;
		int numCad;
		String Suma = null ;

		do {
			System.out.println("Digame su cadena");
			cad = input.nextLine();
			
			numCad = cad.length();
			String cadMin = cad.toLowerCase();
			if (cadFin.equalsIgnoreCase(cad)) {
				cadCom = true;
				System.out.println("El programa a acabado.");
			} else {
				cadCom = false;

			}

			for (int i = 0; i < numCad; i++) {
				char car = cadMin.charAt(i);

				if (car == 'a') {
					numVocA++;
				} else if (car == 'e') {
					numVocE++;
				} else if (car == 'O') {
					numVocO++;
				} else if (car == 'i') {
					numVocI++;
				} else if (car == 'u') {
					numVocU++;
				}
			Suma = Suma + cad ;
			System.out.println(Suma);
				
			}
		} while (cadCom == false);
		System.out.println(" ");

		System.out.println("Su cadena tiene " + (double) numVocA / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocE / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocI / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocO / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocU / numCad * 100 + "%");
		
		input.close();
	}
}
