package ejdowhile;
import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		for(int i = 0; i<5;i++) {
			System.out.println("(" +(i+1)+")");
			System.out.println("Digame su numero: ");
			int n = input.nextInt();
			if(n%3==0) {
				num++;
				
			}
		}
		System.out.println("de sus numeros habia " + num + " multiplos de 3");
		input.close();

	}

}
