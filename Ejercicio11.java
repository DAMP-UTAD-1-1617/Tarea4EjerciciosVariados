import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner in = new Scanner(System.in);
		System.out.println("Primer numero: ");
		A = in.nextInt();
		System.out.println("Segundo numero: ");
		B = in.nextInt();
		System.out.println("Tercer numero: ");
		C = in.nextInt();
			if (A<10 || B<10 || C<10){
				System.out.println(("Alguno de tus numeros ")
					+(A)+(", "+B)+(", "+C)+(" son menores a diez"));
			}else{System.out.println(("Todos tus son mayor que diez"));}
	}
	}


