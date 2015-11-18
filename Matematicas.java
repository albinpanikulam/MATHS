/**clase que va a contener
 * metodos estaticos de calculo matematico
 * @author Albin
 * @version 0.0
 * */
public class Matematicas{
	public static boolean esPar(int numero){
		/**
		 * @param numero entero
		 * @return boolean
		 * */
		
		int resto= numero%2;
		boolean valor= resto==0;
		
		if (valor==true){
		
			return true;
			}
			else{
				return false;

			}
		}
			
			
		public static boolean esDivisiblePorTres(int numero){	
			/**
		 * @param numero entero
		 * @return boolean
		 * */
		
		int resto= numero%3;
		boolean valor= resto==0;
		
		if (valor==true){
		
			return true;
			}
			else{
				return false;
			}
		}
		
		
		public static boolean esDivisiblePorCinco(int numero){	
			/**
		 * @param numero entero
		 * @return boolean
		 * */
		
		int resto= numero%5;
		boolean valor= resto==0;
		
		if (valor==true){
		
			return true;
			}
			else{
				return false;
			}
		}
	}
	
				
		
		
		
	
