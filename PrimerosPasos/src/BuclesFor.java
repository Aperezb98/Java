import javax.swing.*;
public class BuclesFor {

	public static void main(String[] args) {
		
		String email=JOptionPane.showInputDialog("Escribe su email para verificar si es correcto");
		int arroba=0;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@'){
				arroba++;
			}
		}
		if(arroba>=2) {
			System.out.println("Solo puede haber un '@' en el email");
		}
		if(arroba==0){
			System.out.println("No hay ningún '@'");
		}else if(arroba==1){
			System.out.println("Email correcto");
		}

	}

}
