import javax.swing.*;
public class BucleWhile {

	public static void main(String[] args) {
		
			String clave="llave";
			String pass="";
			pass=JOptionPane.showInputDialog("Introduce la clave para acceder por favor");
			while(clave.equals(pass)==false) {
				System.out.println("Contraseņa incorrecta");
				pass=JOptionPane.showInputDialog("Introduce la clave");
			}System.out.println("Contraseņa correcta, acceso permitido");
	}

}
