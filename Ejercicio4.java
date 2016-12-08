import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Numero uno: ");
		int A = in.nextInt();
		System.out.println("Numero dos: ");
		int B = in.nextInt();
		System.out.println("Numero tres: ");
		int C = in.nextInt();
			if (A>B && A>C){
				num=A;
			}else if(B>A && B>C){
				num=B;
			}else{
				num=C;
			}
			System.out.println("numero mayor es: "+num);
	}

}
