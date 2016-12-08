import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double nota1 , nota2, nota3;
		double suma;
		double notaMedia;
		
		Scanner in = new Scanner(System.in);
		System.out.println("PROGRAMACION: ");
		nota1 = in.nextDouble();
		System.out.println("ENTORNOS: ");
		nota2 = in.nextDouble();
		System.out.println("SISTEMAS: ");
		nota3 = in.nextDouble();
		
		notaMedia = ((nota1+nota2+nota3)/3);
			if (notaMedia >= 7){
				System.out.println("Promocionado!!! tu nota media es: "+notaMedia);
			}else{
				System.out.println("Repites curso :( tu nota media es: "+notaMedia);
			}
	}
}
