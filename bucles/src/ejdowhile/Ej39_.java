package ejdowhile;
import java.util.Scanner;

public class Ej39_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cont = 0;
		int numMen = 0;
		int numMay = 0;
		int numNeg = 0;
		int numPos = 0;
		for(int i = 0; i<10;i++) {
			System.out.println("Digame su numero");
			int num = input.nextInt();
			if(num<0) {
				numMen = numMen + num;
				numNeg++;
				
				
			}
			else if ( num>0) {
				numMay = numMay + num;
				numPos++;
			}
			else if (num==0) {
				cont++;
			}
		}
		System.out.println("numero negativos media " + (numMen/numNeg));
		System.out.println("numero postivos media " + (numMay/numPos));
		System.out.println("nuemro de 0s " + cont );
		
		input.close();
	}

}
