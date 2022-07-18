package calculo;

public class Calculadora { 
	
	/* Atributos */
	private boolean encendida;
	
	private double resultado;

	/**
	 * Constructor por defecto
	 */
	public Calculadora() {
		this.encendida = true;
	}

	/* Getters y Setters */

	/**
	 * @return the encendida
	 */
	public boolean isEncendida() {
		return encendida;
	}

	/**
	 * @param encendida the encendida to set
	 */
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	/**
	 * @return the resultado
	 */
	public double getResultado() {
		return resultado;
	}
	
    //Metodo de ejemplo (Realizar comentarios despues)	
	public void suma(int num1, int num2) {
		this.resultado =  num1 + num2;  
    }
	

	
	
	
	

}
