
public class mainApp {
	
	public static void main(String[] args) {
		
		// Llamamos al metodo que se encarga de generar y mostrar el numero aleatorio
		generarNumeroaleatorio();
		
	}
	
	public static void generarNumeroaleatorio() {
		
		// Creamos el objeto numeroAleatorio
		nAleatorio numeroAleatorio = new nAleatorio();
		// Mostramos el numero aleatorio generado
		System.out.println("El numero aleatorio es: " + numeroAleatorio.getNumero());
		// Mostramos si el numero generado es par o impar
		System.out.println("El numero " + numeroAleatorio.getNumero() + " es: " + numeroAleatorio.esPar());
		
	}
}
