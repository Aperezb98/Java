import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu género (H/M):");
			
		}while(genero.equalsIgnoreCase("H")==false&&genero.equalsIgnoreCase("M")==false);
		if(genero.equalsIgnoreCase("H")){
			String altura=JOptionPane.showInputDialog("Introduce tu altura");
			double decimales=Double.parseDouble(altura);
			int resultado=(int)(decimales*100);
			System.out.println(resultado);
				System.out.println("Su peso ideal sería-->"+(resultado-110)+"KG");
		}else {
			String altura=JOptionPane.showInputDialog("Introduce tu altura");
			double decimales=Double.parseDouble(altura);
			int resultado=(int)(decimales*100);
				System.out.println("Su peso ideal sería-->"+(resultado-120)+"KG");
		}
	}

}
