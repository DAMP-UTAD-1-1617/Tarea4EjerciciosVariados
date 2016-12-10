import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		int valor1,valor2, valor3;
		Scanner in = new Scanner(System.in);
		System.out.println("Valor1: ");
		valor1 = in.nextInt();
		System.out.println("Valor2: ");
		valor2 = in.nextInt();
		System.out.println("Valor3: ");
		valor3 = in.nextInt();
			if(valor1==valor2 && valor1==valor3){
				System.out.println((valor1+valor2)*valor3);
			}else{
				System.out.println(("tus valores son: ")+("\n")+(valor1)+("\n")+(valor2)+("\n")+(valor3));
			}
	}
}
