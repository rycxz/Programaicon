import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int opciones = 0;
		do {
			System.out.println("1.- Volumen esfera");
			System.out.println(" 2.- Numero de tres cifras con cifras por separado");
			System.out.println("3.- Letras minúsculas");
			System.out.println("4.- Pares entre dos números");
			System.out.println("5.- Salir");
			System.out.println("Digame su opcion");
			opciones = input.nextInt();
			switch (opciones) {
			case 1:
				double numCase1 = 0;
				do {
					System.out.println("Digame el numero de la esfera. (el 0 para salir)");
					numCase1 = input.nextDouble();
					double numEsfera = (4 * Math.PI * Math.pow(numCase1, 3));
					System.out.println("Su volemn es " + numEsfera);

				} while (numCase1 != 0);
				break;

			case 2:
				int numCase2 = 1;
				do {
					System.out.println("Digame un numero de 3 cifras ( el 0 solo para salir)");
					numCase2 = input.nextInt();
					int num1 = numCase2 / 100;
					System.out.print(num1 + " ");
					int num2 = (numCase2 % 100) / 10;
					System.out.print(num2 + " ");
					int num3 = (numCase2 % 100) % 10;
					System.out.print(num3 + " ");
					System.out.println();
				} while (numCase2 != 0);
				break;

			case 3:
				input.nextLine();
				char car;
				do {
					System.out.println("Digame su caracter: (pulse ! para salir)");
					car = input.nextLine().charAt(0);
					System.out.println("Digame su caracter 2:");
					char car2 = input.nextLine().charAt(0);

					if (car == car2) {
						System.out.println("Su caracteres son iguales");
					} else {
						System.out.println("Sus caracteres no son iguales");
					}

				} while (car != '!');
				break;

			case 4:
				int num = 2;
				do {
					int cont = 0;
					System.out.println("Digame su primer numero. (el 0 es para salir)");
					num = input.nextInt();
					System.out.println("Digame su segundo numero.");
					int num2 = input.nextInt();
					for (int i = num; i <= num2; i++) {
						if (i % 2 == 0) {
							cont++;
						}
					}
					System.out.println("El numero de primos que hay entre los 2 numeros es " + cont);

				} while (num != 0);
				break;

			case 5:
				System.out.println("Ha salido.");
				opciones = 0;
				break;

			default:
				System.out.println("Introduzca una opcion valida");
			}

		} while (opciones != 0);
		input.close();

	}

}
