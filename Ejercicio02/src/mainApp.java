
import customException.CustomException;

public class mainApp {
	
	public static void main(String[] args) {
		inputOutput();
	}
	
	
	/*
	 * Metodo que muestra mensahes y crea un objeto de la clase exception
	 */
	public static void inputOutput() {
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			
			throw new CustomException("Execepcion captura por mensaje: Esto es un objeto Excepcion");
		}catch (CustomException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("Programa terminado");
		}
	}
	
}
