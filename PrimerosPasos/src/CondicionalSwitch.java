import java.util.Scanner;
public class CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada=new Scanner(System.in);
				System.out.println("Áreas geométricas");
				System.out.println("Si desea el area del cuadrado, pulse '1', si desea el area"
						+ "del rectangulo pulse '2', si desea el del triangulo pulse '3', del ciruclo"
						+ "pulse '4':");
				byte dato=entrada.nextByte();
				if(dato<-128||dato>127) {
					System.out.println("Debe pulsar entre 1 y 4");
				}else {
					
					switch(dato) {
					
						case 1:
							System.out.println("Dime cuanto es la base del cuadrado:");
								double baseCuadrado=entrada.nextDouble();
									System.out.println("El area del cuadrado es: "+Math.pow(baseCuadrado, 2));
								break;
						case 2:
							System.out.println("Dime cuanto es la base del rectángulo:");
								double baseRec=entrada.nextDouble();
							System.out.println("Dime cuanto es la altura del rectángulo:");
								int alturaRec=entrada.nextInt();
									System.out.println("El area del rectángulo es: "+(baseRec*alturaRec));
								break;
						case 3:
							System.out.println("Dime cuanto es la base del triangulo:");
								double baseTri=entrada.nextDouble();
							System.out.println("Dime cuanto es la altura del triangulo:");
								double alturaTri=entrada.nextDouble();
									System.out.println("El area del triangulo es: "+(baseTri*alturaTri)/2);
								break;
						case 4:
							System.out.println("Dime cuanto es el radio del circulo:");
								double radio=entrada.nextDouble();
									System.out.print("El area del circulo es: ");
									System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
								break;
						default:
							System.out.println("Debe pulsar entre 1 y 4");
								break;
					}
				}

	}

}
