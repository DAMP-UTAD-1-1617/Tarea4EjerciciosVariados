import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//inicializacion
		int num1, num2;
		int sumaNum, resto;
		int restaNum, division;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Dame el segundo numero: ");
		num2 = sc.nextInt();
		//proceso
		if (num1 >= num2) {
			
			sumaNum = num1 + num2;
			resto = num1 % num2;
			System.out.println("La suma es: " + sumaNum + " y el resto es " + resto + ".");

		} else if (num1 <= num2) {
			
			restaNum = num1 - num2;
			division = num1 / num2;
			System.out.println("La resta es: " + restaNum + " y la division es " + division + ".");
		}

	}

}
