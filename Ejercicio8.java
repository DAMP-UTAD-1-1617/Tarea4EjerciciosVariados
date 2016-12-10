import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		int dia, mes, año;
		Scanner in = new Scanner(System.in);
		System.out.println("Dia: ");
		dia = in.nextInt();
		System.out.println("Mes: ");
		mes = in.nextInt();
			if(dia==25 && mes==12){
				System.out.println("25 de diciembre es el dia de Navidad!!!");
			}else if(dia==1 && mes==1){
				System.out.println("1 de enero es el dia de año nuevo!!!");
			}else{
				System.out.println(dia+" no es navidad ni año nuevo");
			}
	}
}
