import java.util.Scanner;
public class UsoArrays3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Indique cuantos numeros aleatorios desea: ");
		int tamano=entrada.nextInt();
			
		System.out.println("Los numeros aleatorios son los siguientes:");
		int matriz[]=new int[tamano];
		for(int i=0;i<matriz.length;i++) {
		matriz[i]=(int)(Math.random()*100);
			
		}
		for(int elemento:matriz) {
			System.out.println("Numero aleatorio -->"+elemento);
		}

	}

}
