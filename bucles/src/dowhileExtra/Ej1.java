package dowhileExtra;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.- Convertir a Binario");
		System.out.println("2.- Convertir a Hexadecimal");
		System.out.println("3.- Convertir a Octal");
		System.out.println("4.- Salir");
		System.out.println("Introduce una opcion");
		
		Scanner input = new Scanner(System.in);
		int numMen = input.nextInt();
		switch(numMen) {
		case 1:
			
			System.out.println("Bianrio");
			System.out.println("Digame su nuemro");
			int num = input.nextInt();
			System.out.println(Integer.toBinaryString(num));
			break;
		case 2:
			
			System.out.println("Bianrio");
			System.out.println("Digame su nuemro");
			int num1 = input.nextInt();
			System.out.println(Integer.toHexString(num1));
			break;
		case 3:
			
			System.out.println("Bianrio");
			System.out.println("Digame su nuemro");
			int num2 = input.nextInt();
			System.out.println(Integer.toOctalString(num2));
			break;
		case 4 :
			System.out.println("Ha salido");
			break;
			default:
				System.out.println("Numero de 1-4");
			}
			input.close();
	}

}
