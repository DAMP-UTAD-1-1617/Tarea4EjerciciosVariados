import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Numero positivo 1 o 2 dígitos: ");
		num = in.nextInt();
			if(num<10){
				System.out.print("El numero "+num+" solo tiene 1 digito");
			}else{
				System.out.println("El numero "+num+" tiene dos digitos");
			}
	}

}
