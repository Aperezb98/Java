import java.util.Scanner;
public class AdivinaNumero {

	public static void main(String[] args) {
		
		//ADIVINAR UN NUMERO ALEATORIO
		double numero=Math.random()*100;
		int aleatorio=(int)numero;//refundición o casteo
		
		System.out.println("Adivina el número");
		Scanner entrada=new Scanner(System.in);
		
			int datos=-1;
			int contador=0;
			
			while(datos!=aleatorio) {
				contador++;
				System.out.print("Introduce un numero: ");
				datos=entrada.nextInt();
				
				if(datos<aleatorio) {
					System.out.println("Su numero es menor, intentelo de nuevo.");
					}
				else if(datos>aleatorio) {
					
					System.out.println("Su numero es mayor, intentelo de nuevo.");
					}
			}
			System.out.println("Enhorabuena acertaste en "+contador+" intentos.");
		}
}

