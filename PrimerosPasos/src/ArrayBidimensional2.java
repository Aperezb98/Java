
public class ArrayBidimensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double interes=0.10;
		double acumulado;
		double saldo[][]=new double[6][5];
		
		for(int i=0;i<6;i++) {
			saldo[i][0]=10000;
			acumulado=10000;
			System.out.println("Con un interes del-->"+(int)(interes*100)+"%");
			
				for(int j=1;j<5;j++) {
					acumulado=(acumulado*interes)+acumulado;
					saldo[i][j]=acumulado;
					System.out.printf("%1.2f",saldo[i][j]);
					System.out.println();
				}
				
				interes=interes+0.01;
		}
		
	}

}
