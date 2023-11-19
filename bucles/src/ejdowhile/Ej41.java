package ejdowhile;
import java.util.Scanner;

public class Ej41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Diagem su nuemro");
		int altura = input.nextInt();
		
		for(int i = 1; i<=altura;i++) {
		int numEs = altura-i;
		System.out.println();
		for(int j = numEs;j>0;j--) {
			System.out.print(" ");
	
		}
		int numAs = i*2-1;
			for(int k = 0 ;k<numAs;k++) {
				System.out.print("*");
			}
		}
		input.close();

	}

}
