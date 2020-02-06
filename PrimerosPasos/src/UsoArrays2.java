import javax.swing.*;
public class UsoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPaises=Integer.parseInt(JOptionPane.showInputDialog("Cuantos Países quieres añadir:"));
		String paises[]=new String[numPaises];
		String pais="";
		
		for(int i=0;i<paises.length;i++) {
			pais=JOptionPane.showInputDialog("Indique Pais: "+i);
			paises[i]=pais;
		}
		for(String elemento:paises) { 
			//Por cada elemento(Lo hemos llamado asi) del array Paises.
			//El elemento debe der ser del tipo de dato que la matriz(array)
			System.out.println(elemento);
		}
	}

}
