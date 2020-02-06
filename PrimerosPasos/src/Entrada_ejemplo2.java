import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor:");
		String edad=JOptionPane.showInputDialog("Introduce la edad por favor:");
		int numEdad=Integer.parseInt(edad);
		System.out.println("Hola "+Nombre_usuario+" . Tendrás el año que viene "+(numEdad+1)+" años.");
	}

}
