package Controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	public int fatorial(int num, int resultado, int limite) {
		if(num == limite) {
			/*
			 * a condição de parada feita para parar quando o numero que progride de 1 atén chega no n
			 */
		return  resultado;}
		
			return fatorial( num+1, resultado * (num+1), limite);
			
	/* se passa o termo n através de parametro, nesse caso chumbado por praticidade
	 * no caso fiz o fatorial com a progressão ao invés de ir subtraindo
		
		*/
		

	}
	
	}

	