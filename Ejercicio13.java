import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		float salario;
		int a�os;
		float subida;
		float salarioTotal;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Salario empleado?: ");
		salario=in.nextFloat();
		System.out.print("Antig�edad? ");
		a�os=in.nextInt();
			if(salario<500 && a�os>=10){
				subida=salario*0.20f;
				salarioTotal=salario+subida;
				System.out.print("Salario a ingresar "+salarioTotal);
			}else if(salario<500 && a�os<10){
				subida=salario*0.05f;
				salarioTotal=salario+subida;
				System.out.print("Salario a ingresar "+salarioTotal);
				}else{
					System.out.print("Su salario actual es: "
				+(salario)+(" y su antig�eda ")+(a�os)+"\nno cumple los requistos para un aumento");
				}}}


