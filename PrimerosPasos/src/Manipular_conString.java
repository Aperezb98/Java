
public class Manipular_conString {

	public static void main(String[] args) {
		
		//Se instancia o se elabora un ejemplar con objeto llamdo cadena
		String cadena="Alberto";
		
		//Clase String
			//Objeto.lenght()
				//Devuelve la longitud de la cadena
		int resultado=cadena.length();
		System.out.println("La longitud de Alberto es--> "+resultado);
		
			//Objeto.charAt()
				//Devuelve el caracter asociado a un posicion de la cadena dado
		char letraCadena=cadena.charAt(2);
		System.out.println("La posicion 2 de Alberto es--> "+letraCadena);
				//Devolver �ltima letra para cualquier cadena
		char letraUltimaCadena=cadena.charAt(cadena.length()-1);
		System.out.println("La �ltima letra de "+cadena+" usando dos m�todos es--> "+letraUltimaCadena);
		
			//Objeto.substring()
				//Devuelve el caracter asociado a un posicion de la cadena dado
		String resultado2=cadena.substring(0,4);//La posicion 4 no se coje
		System.out.println("Si substraemos de "+cadena+" de la posicion 0 a 4, obtenemos--> "+resultado2);
		
			//Objeto.equals()
				//Devuelve "true" si dos cadenas son exactamente iguales o "false" caso contrario
					//Diferencia por ello entre may�suclas y min�sculas
		
		String cadena1="Alberto"; //A may�scula
		String cadena2="alberto"; //a min�scula
		final int si=1;
		final int no=0;
		
		if (cadena.equals(cadena2)){
			System.out.println("Las cadenas "+cadena+" y "+cadena2+ " son id�nticas--> "+si);
		}else {
			System.out.println("Las cadenas "+cadena+" y "+cadena2+ " no son id�nticas--> "+no);
		}
			//Objeto.equalsIgnoreCase()
				//Compara cadena sin tener en cuenta may�sculas y minusculas
		if (cadena.equalsIgnoreCase(cadena2)){
			System.out.println("Las cadenas "+cadena+" y "+cadena2+ " son id�nticas, gracias IgnoreCase--> "+si); 
			//Deber�a de volver este ya que ambas cadenas con este metodo
										//son identicas
		}else {
			System.out.println(no);
		}
	}

}
