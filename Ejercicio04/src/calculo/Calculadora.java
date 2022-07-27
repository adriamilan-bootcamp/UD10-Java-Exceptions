package calculo;

public class Calculadora { 
	
	/* Atributos */
	private double numero1 = 0.00;
	private double numero2 = 0.00;

	
	
	
	
	
	/**
	 * Constructor por defecto
	 */
	public Calculadora() {
	}

	/*
	 * Constructor para:
	 * - Raiz cuadrada
	 * - Raiz cubica
	 */
	public Calculadora(double valor1, String operacion) {
		this.numero1 = valor1;
	}
	
	/*
	 * Constructor para:
	 * - Suma
	 * - Resta
	 * - Multiplicacion
	 * - Division
	 * - Potencia
	 */
	public Calculadora(int valor1, double valor2) {
		this.numero1 = valor1;
		this.numero2 = valor2;
	}
	
	// Getters

    /**
	 * @return the numero1
	 */
	public double getNumero1() {
		return numero1;
	}

	/**
	 * @return the numero2
	 */
	public double getNumero2() {
		return numero2;
	}

	
	
	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	/**
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	/*
     * Metodo suma
     * numero1 + numero2	
     */
	public double suma() {
		return this.numero1 + this.numero2;
    }
	
	/*
     * Metodo multiplicar
     * numero1 * numero2	
     */
	public double multiplicar() {
		return this.numero1 * this.numero2;
    }
	
	/*
     * Metodo potencia
     * numero1^numero2	
     */
	public double potencia() {
		double resultado = 0.00;
		for(int i = 0; i < this.numero2; i++) {
			resultado *= this.numero1; 
		}
		return resultado;
    }
	
	/*
     * Metodo dividir
     * numero1 / numero2	
     */
	public double dividir() {
		return this.numero1 / this.numero2;
    }
	
	/*
     * Metodo restar
     * numero1 - numero2	
     */
	public double restar() {
		return this.numero1 - this.numero2;
    }
	
	/*
     * Metodo raiz cuadrada
     * √numero1
     */
	public double raizCuadrada() {
		return Math.sqrt(this.numero1);
    }
	
	/*
	 * Metodo raiz cubica
	 */
	public double raizCubica() {
		return Math.cbrt(this.numero1);
	}
}
