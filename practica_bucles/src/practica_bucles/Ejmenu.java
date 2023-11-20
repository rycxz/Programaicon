package practica_bucles;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;

public class Ejmenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			System.out.println("Digame la opcion del menu");
			System.out.println("1-Para calcuar los primos que tiene del 1 a su numero");
			System.out.println("2-Para sacar los divisores que tiene");
			System.out.println("3-Para contar la cantidad de vocales que tiene");
			System.out.println("4-Todos los perfectos de 0 al numero introducido");
			System.out.println("5-Contar la posicion del carcter de su cadena y cual es");
			System.out.println("6-Pedir 10 nuermos al usuario y dpeues ordenarlos de menor a mayor");
			System.out.println("7-Pedir 10 nuemro y decir si aguno es 0 o negativo");
			System.out.println("8-Pedimos constantement la canidad top de litos de un deposito y el usuario le va añadiendo o restando litros"
					+ " si se llega al top finaliza y no puede ser negativo");
			System.out.println("9-Programa que pide una letra y continua desde esa letra hasta acabar el abecedario");
			System.out.println("10-Pedir al sistema al que se queire convertir un numero siendo (Bianrio,Hexadeciaml y Octal) y dpues el nuemero y realizar la conversion");
			int menu = 11;
			do {
				menu= input.nextInt();
				switch(menu) {
				case 1:
					System.out.println("Digame su numero");
					int numCase1 = input.nextInt();
					int cntDivCase1 = 0;
					int cntPr = 0;
					for(int i = 1;i<numCase1;i++) {
						if(numCase1%i==0) {
							cntDivCase1++;
							cntPr = i + cntPr;
							
							
						}
						
						
							
						}
					
				
						System.out.println("Su numero tiene "  + cntDivCase1 + " divisores");
					
					
					
					
					break;
				case 2:
				break;
				case 3:
					break;
				case 4:
				break;
				case 5:
					break;
				case 6:
				break;
				case 7:
					break;
				case 8:
				break;
				case 9:
					break;
				case 10:
				break;
				case 0:
				break;
				default:
					System.out.println("Introduzca una opcion valida");
				}
			}
			while(menu!=0);
			input.close();
	}

}
