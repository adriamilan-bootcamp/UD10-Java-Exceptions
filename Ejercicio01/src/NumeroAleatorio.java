
public class NumeroAleatorio {
	
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
