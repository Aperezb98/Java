import java.util.*;
public class CondicionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in); //Condicional IF AND ELSE
			System.out.println("Introduce tu edad, por favor:");
				int dato=entrada.nextInt();
				if(dato<18) {
					System.out.println("Eres menor de edad");
				}else {
					System.out.println("Eres mayor de edad");
				}
			
	}

}
