import java.util.Scanner;

public class Ej2BuclesExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		do {
		
			System.out.println("Digame las opciones del menu");
			System.out.println("1.- Números del 1 al 100");
			System.out.println("2.- Positivos negativos o pares");
			System.out.println("3.- Salir");
				num = input.nextInt();
			int numCase = 0;
			switch(num) {
			case 1:
				while(numCase!=100) {
					numCase++;
					System.out.println(numCase);
				}
				break;
			case 2:
				
				int numCad = 0;
				do {
					input.nextLine();
					
					System.out.println("Digame su nuemro");
					 numCad = input.nextInt();
					if(numCad>0) {
						System.out.println("Su numero es mayor de 0");
					}
					else {
						System.out.println("Su numero es negativo");
					}
					
					if(numCad%2==0) {
						System.out.println("Su numero es par");
					}
					else {
						System.out.println("Su nuemro no es par");
					}
					
				}
				while(numCad != 0) ;
			
					
				
				break;
			case 3:
				System.out.println("Ha salido");
				break;
				default:
					System.out.println("Diga un numero correcto");
					
					
			}
			
			
			
		}
		
	while(num!=3);
		input.close();
		
	

	}

}
