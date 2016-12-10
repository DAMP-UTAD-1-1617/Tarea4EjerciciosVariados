import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		System.out.println("Coordenada x: ");
		x=in.nextInt();
		System.out.println("Coordenada y: ");
		y=in.nextInt();
			if(x>0 && y>0){
				System.out.println("Coordenadas en el primer cuadrante");
			}else if(x<0 && y>0){
				System.out.println("Coordenadas en el segundo cuadrante");
			}else if(x<0 && y<0){
				System.out.println("Coordenadas en el tercer cuadrante");
			}else if(x>0 && y<0){
				System.out.println("Coordenadas en el cuarto cuadrante");
			}else{System.out.println("Coordenadas en el quinto cuadrante");}
	}
}

