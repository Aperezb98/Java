import java.util.Scanner;
public class BuclesFor2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.print("Indique el numero que desea su factorial:");
			int numero=entrada.nextInt();
			int variable=1;
			for(int i=1;i<=numero;i++) {
				variable=variable*(i);
			}
			System.out.println(variable);
	}

}
