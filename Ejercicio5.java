import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		int numero;
		Scanner in = new Scanner(System.in);
		System.out.println("numero: ");
		numero = in.nextInt();
			if (numero==0){
				System.out.println(numero+" es numero es nulo ");
			}else if(numero>0){
				System.out.println(numero+" es numero es positivo ");
			}else{
				System.out.println(numero+" es numero negativo");
			}
	}
}
