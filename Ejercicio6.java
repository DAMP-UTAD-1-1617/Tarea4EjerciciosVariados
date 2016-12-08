import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("Dame un numero de 1, 2 o 3 digitos: ");
		numero = in.nextInt();
			if (numero<10){
				System.out.println(numero+" es un numero de un digito");
			}else if (numero<100){
				System.out.println(numero+" es un numero de dos digitos");
			}else if (numero<1000){
				System.out.println(numero+" es un numero de tres digitos");
			}else{
				System.out.println("error el numero es mayor de tres digitos");
			}
	}
}
