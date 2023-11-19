package ejdowhile;
import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 0; i<num;i++) {
			
			for(int j = 0 ;j<num;j++) {
				System.out.print("(" + i +"," + j + ")");
				
			}
			System.out.println();
			
		}
		input.close();

	}

}
