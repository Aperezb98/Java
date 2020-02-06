
public class ArrayBidimensional {

	public static void main(String[] args) {
		
		int matriz [][]=new int[4][5];
			matriz[0][0]= 4;
			matriz[0][1]= 25;
			matriz[0][2]= 45;
			matriz[0][3]= 14;
			matriz[0][4]= 23;
			
			matriz[1][0]= 34;
			matriz[1][1]= 24;
			matriz[1][2]= 411;
			matriz[1][3]= 124;
			matriz[1][4]= 1;
			
			matriz[2][0]= 54;
			matriz[2][1]= 344;
			matriz[2][2]= -4;
			matriz[2][3]= -23;
			matriz[2][4]= 2;
			
			matriz[3][0]= 11;
			matriz[3][1]= 62;
			matriz[3][2]= 34;
			matriz[3][3]= 232;
			matriz[3][4]= 3;
		
		for(int i=0;i<matriz.length;i++) {
			System.out.println("Datos de matriz en la posicion-->"+(i+1));
				for(int j=0;j<matriz.length;j++) {
					System.out.println(matriz[i][j]);
				}
		}
		
	}

}
