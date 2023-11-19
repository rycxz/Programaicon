package ejdowhile;
import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digame su cadena");
		String cad = input.nextLine();
		String cadMin = cad.toLowerCase();
		int numCad = cad.length();
		int numVocA = 0;
		int numVocE = 0;
		int numVocI = 0;
		int numVocO = 0;
		int numVocU = 0;
		for (int i = 0; i < numCad; i++) {
			char car = cadMin.charAt(i);
			System.out.print(car + " ");
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

		}
		int numVoc = numVocA + numVocE + numVocI + numVocO + numVocU;
		System.out.println(" ");

		System.out.println("Su cadena tiene " + (double) numVocA / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocE / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocI / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocO / numCad * 100 + "%");
		System.out.println("Su cadena tiene " + (double) numVocU / numCad * 100 + "%");
		input.close();

	}

}
