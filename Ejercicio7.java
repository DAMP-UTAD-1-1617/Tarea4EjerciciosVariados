import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		int total;
		int correctas;
		int porcentaje;
		Scanner in = new Scanner(System.in);
		System.out.println("numero total preguntas: ");
		total=in.nextInt();
		System.out.println("numero de preguntas contestadas: ");
		correctas=in.nextInt();
		porcentaje = correctas*100/total;
			if(porcentaje>=90){
				System.out.println(porcentaje+"% de preguntas, nivel maximo");
			}else if (porcentaje>=75 && porcentaje<90){
				System.out.println(porcentaje+"% de preguntas, nivel medio");
			}else if(porcentaje>=50 && porcentaje<75){
				System.out.println(porcentaje+"% de preguntas nivel regular");
			}else{System.out.println(porcentaje+"% de preguntas nivel bajo");
				
			}
	}
}
