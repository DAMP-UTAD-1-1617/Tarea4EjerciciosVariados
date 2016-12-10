import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		float salario;
		int años;
		float subida;
		float salarioTotal;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Salario empleado?: ");
		salario=in.nextFloat();
		System.out.print("Antigüedad? ");
		años=in.nextInt();
			if(salario<500 && años>=10){
				subida=salario*0.20f;
				salarioTotal=salario+subida;
				System.out.print("Salario a ingresar "+salarioTotal);
			}else if(salario<500 && años<10){
				subida=salario*0.05f;
				salarioTotal=salario+subida;
				System.out.print("Salario a ingresar "+salarioTotal);
				}else{
					System.out.print("Su salario actual es: "
				+(salario)+(" y su antigüeda ")+(años)+"\nno cumple los requistos para un aumento");
				}}}


