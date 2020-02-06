
public class Calculos_conMath {

	public static void main(String[] args) {
			//Math.sqrt()
				// método sqrt()
					//para obtener raiz cuadrada obliga a utilizar "double"
						//ya que devuelve un decimal.
		
		double raiz=Math.sqrt(37);
		System.out.println(raiz);
		
			//Math.round()
				//con long
					//método round para redondear, obliga a utilizar "long".
		
		long resultado=Math.round(raiz); 
		System.out.println("Resultado 1--> "+resultado);
		
				//con float
		float num1=5.85f;
		int resultado1=Math.round(num1);
		System.out.println("Resultado 2--> "+resultado1);
		
			//Math.pow()
				//elevar un numero a una potencia
		
		double base=5;
		double exponente=3;
		double resultadoPow=Math.pow(base, exponente);
		System.out.println("ResultadoMetodoPow--> "+resultadoPow);
		
		
		
				//IMPORTANTE REFUNDICION
					//Permite convertir un valor a tipo de dato que queramos.
		
		System.out.println("REFUNDICIONES");
		
		double num2=10.85;
		int resultado2=(int)Math.sqrt(num2);
		System.out.println("Resultado 3--> "+resultado2);
		
		double num3=10.85;
		int resultado3=(int)Math.round(num3);
		System.out.println("Resultado 4--> "+resultado3);
		
		
		int resultadoPow2=(int)Math.pow(base, exponente);
		System.out.println("ResultadoMetodoPow--> "+resultadoPow2);
		
			//Math.random()
				//Genera un numero aleatorio entre 0.0 y 1.0
		num2=Math.random();
		System.out.println("El número aleatorio es--> "+num2);
		
		
	}

}
