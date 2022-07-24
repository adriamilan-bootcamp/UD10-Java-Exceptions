import java.util.Random;

public class nAleatorio {
	
	/* Atributo */	
	private int numero;
	
	/* Constructor */
	public nAleatorio() {
		System.out.println("Generando numero aleatorio...");
		genNum();
	}
		
	/* Getter */
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/*
     * Metodo que genera aleatoriamente un numero entre 0 y 999
     */
	public void genNum() {
		Random r = new Random();
		this.numero =  r.nextInt(999); 
	}
	
	/*
     * Metodo comprueba si el numero generado aleatoriamente es par o impar
     */
	public String esPar() {
		String message = "";
		
		if(numero % 2 == 0) { // Si el resto es 0
			message = "par";
		} else {
			message = "impar";
		}
		
		return message; // Devuelve un string con el contenido "par" o "impar"
	}

}
