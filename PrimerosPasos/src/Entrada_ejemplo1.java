import java.util.Scanner;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce tu nombre:");
				String nombre=entrada.nextLine();
				//Si la entrada de datos es string usaremos el objeto construido y el método--> .netxline();				
				//Tambien está para long etc.. ver API JAVA.
				
			System.out.println("Introduce edad:");
				int edad=entrada.nextInt();
				//Si la entrada de datos es string usaremos objeto.netxInt();
				
			System.out.println("Introduce tu altura:");
				double altura=entrada.nextDouble();
				//Si la entrada de datos es double usaremos objeto.nextdouble();
				
				
			System.out.println("Muchas gracias "+nombre+" por darnos su edad "+edad+" y su altura "+altura);
				/*Se ingresan los datos a partir de la clase System con metodo System.in del paquete
				 * por defecto JAVA o paquete JAVA LANG.
				 * 
				 *A partir del objeto "entrada" creado por el constructor importando para ello el paquete
				 * java util Scanner y a partir de os metodos anteriores que se
				 * llevan acabo con el objeto instanciado "entrada", recogidos por las variables
				 * nombre,edad y altura*/
			
	}

}
