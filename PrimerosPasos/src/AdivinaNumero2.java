import java.util.Scanner;
public class AdivinaNumero2 {

	public static void main(String[] args) {
		
		//ADIVINAR UN NUMERO ALEATORIO
		double numero=Math.random()*100;
		int aleatorio=(int)numero;//refundición o casteo
		
		System.out.println("Adivina el número");
		Scanner entrada=new Scanner(System.in);
		
			int datos=0;
			int contador=0;
			
			do{
				contador++;
				System.out.print("Introduce un numero: ");
				datos=entrada.nextInt();
				
				if(datos<aleatorio) {
					System.out.println("Su numero es menor, intentelo de nuevo.");
					}
				else if(datos>aleatorio) {
					
					System.out.println("Su numero es mayor, intentelo de nuevo.");
					}
			}while(datos!=aleatorio);
			System.out.println("Enhorabuena acertaste en "+contador+" intentos.");
		}
}

