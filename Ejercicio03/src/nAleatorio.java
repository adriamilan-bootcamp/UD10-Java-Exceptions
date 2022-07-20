import java.util.Random;

public class nAleatorio {
	
	private int numero;
	
	public nAleatorio() {
		// TODO Auto-generated constructor stub
		System.out.println("Generando numero aleatorio...");
		genNum();
		System.out.println("El numero generado es: "+numero);
		esPar();
	}
	
	public void esPar() {
		if(numero%2 == 0) {
			System.out.println("Es par");
			return;
		}
		System.out.println("Es impar");
	}
	
	public void genNum() {
		Random r = new Random();
		this.numero =  r.nextInt(999); 
	}

}
