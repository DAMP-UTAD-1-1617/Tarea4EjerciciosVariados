import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner in = new Scanner(System.in);
		System.out.print("valor 1: ");
		A = in.nextInt();
		System.out.print("valor 2: ");
		B = in.nextInt();
		System.out.print("valor 3: ");
		C = in.nextInt();
		System.out.print("Valor de mayor a menor: ");
			if(A>B && A>C){
				System.out.print(A);
			}else if(B>C){
				System.out.print(B);
			}else{
				System.out.print(C);
			}
	
			System.out.print(" y ");
			if(A<B && A<C){
				System.out.print(A);
			}else if(B<C){
				System.out.print(B);
			}else{
				System.out.print(C);
}}}
