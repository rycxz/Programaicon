package ejdowhile;
import java.util.Scanner;

public class Ej35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.println("Dame un numero");
		int limite=input.nextInt();		
		int contadorPrimos=0;

		for (int i=1;i<limite;i++) {
			//usaremos el codigo del ejercicio anterior
			//para saber si es primo
			int numero=i;
			
			boolean esPrimo=true;
			for (int j=2;j<numero;j++) {
				if (numero%j==0) {
					esPrimo=false;
					break;
				}
			}
			if (esPrimo) {
				contadorPrimos++;
			}
		}
		System.out.println("El total de numeros primos es "+contadorPrimos);
		input.close();
	}

}
