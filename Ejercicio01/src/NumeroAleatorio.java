
public class NumeroAleatorio {
	/* Atributo */
	private int valor;
	private int max;
	private int min;
	
	/**
	 * @param valor
	 */
	public NumeroAleatorio() {
		this.max = 500;
		this.min = 1;
		this.valor = generarNumero(max, min);
	}
	
	/* Getter */

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/*
	 * Metodo que crea un numero aleatorio entre dos valores (max i min).
	 * @return numero aleatorio creado.
	 */
	public int generarNumero(int max, int min) {
		return (int) (Math.random() * (max - min)) + min;
	}
	
}
