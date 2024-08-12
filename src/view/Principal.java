package view;

import Controller.FatorialController;
public class Principal {

	public static void main( String[]args) {
		
	
	FatorialController faCon= new FatorialController();
	int resultado=1;
	int num=1;
	int limite = 7;
	int resp= faCon.fatorial(num, resultado, limite);
	System.out.println(resp);
	
}
}