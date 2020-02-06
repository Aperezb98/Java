import java.util.Scanner;
public class EntradaNumeros {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
			System.out.println("Indique de que número desea saber su raiz:");
				double dato=num.nextDouble();
				int datoNumerico=(int)dato;
				System.out.print("La raiz de "+datoNumerico+" es ");
				System.out.printf("%1.2f", Math.sqrt(dato));//Se indica que se imprimira dos decimaes en
																//el resultado de la raiz.

		

	}

}
