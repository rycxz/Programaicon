package menuVariasOpcionesBucles;

import java.util.Scanner;

public class EjMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Digame la opcion del menu");
		System.out.println("1-Para calcuar los primos que tiene del 1 a su numero");
		System.out.println("2-Para sacar los divisores que tiene");
		System.out.println("3-Para contar la cantidad de vocales que tiene");
		System.out.println("4-Todos los perfectos de 0 al numero introducido");
		System.out.println("5-Contar la posicion del carcter de su cadena y cual es");
		System.out.println("6-Pedir 10 nuermos al usuario y dpeues ordenarlos de menor a mayor");
		System.out.println("7-Pedir 10 nuemro y decir si aguno es 0 o negativo");
		System.out.println(
				"8-Pedimos constantement la canidad top de litos de un deposito y el usuario le va añadiendo o restando litros"
						+ " si se llega al top finaliza y no puede ser negativo");
		System.out.println("9-Programa que pide una letra y continua desde esa letra hasta acabar el abecedario");
		System.out.println(
				"10-Pedir al sistema al que se queire convertir un numero siendo (Bianrio,Hexadeciaml y Octal) y dpues el nuemero y realizar la conversion");
		int menu = 11;
		do {
			menu = input.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Digame su numero");
				int numCase1 = input.nextInt();

				for (int i = 1; i < numCase1; i++) {
					boolean Primos = true;
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							Primos = false;
							break;
						}
					}
					if (Primos == true) {
						System.out.println("El nuemro " + i + " es primo");
					}

				}

				break;

			// 2-Para sacar los divisores que tiene
			case 2:
				System.out.println("Digame su numero");
				int lim = input.nextInt();
				for (int i = 1; i < lim; i++) {
					if (lim % i == 0) {
						System.out.println("el numero " + i + " es divisor del su numero");
					}
				}
				break;

			// 3-Para contar la cantidad de vocales que tiene
			case 3:
				System.out.println("Digame su cadena");
				input.nextLine();
				int voc = 0;
				String cad = input.nextLine();
				int cadLimite = cad.length();
				for (int i = 0; i < cadLimite; i++) {
					char car = cad.charAt(i);
					if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
						voc++;

					}
				}
				System.out.println("Su cadena tiene " + voc + " vocales");
				break;

			// 4-Todos los perfectos de 0 al numero introducido
			case 4:
				input.nextLine();
				System.out.println("Digame su nuemro");
				int numCase4 = input.nextInt();

				int diviAc = 0;
				for (int i = 1; i < numCase4; i++) {
					diviAc = 0;
					for (int j = 1; j < i; j++) {

						if (i % j == 0) {
							diviAc = diviAc + j;

						}
					}
					if (diviAc == i) {
						System.out.println("Su nuemro es perfecto" + i);
					}
				}

				break;
				//5-Contar la posicion del carcter de su cadena y cual es
			case 5:
				input.nextLine();
				System.out.println("Digame su cadena");
				String cadCase5 = input.nextLine();
				int cadLon5 = cadCase5.length();
				for(int i =0;i<cadLon5;i++) {
					char carCase5 = cadCase5.charAt(i);
					if(carCase5<65||carCase5>90&&carCase5<97||carCase5>122) {
						System.out.println("Su cadena contiene carcateres y estos son" + carCase5);
						
					}
					
				}
				
				break;
				//6-Pedir 10 nuermos al usuario y dpeues ordenarlos de menor a mayor
			case 6:
				input.nextLine();
				System.out.println("Digame su numeros ");
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
		} while (menu != 0);
		input.close();

	}

}
