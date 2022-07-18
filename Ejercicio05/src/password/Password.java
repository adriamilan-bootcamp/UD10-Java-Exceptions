package password;

public class Password {
	
	
	
	
	
	
	
	
	
	/*
	 * Metodo que comprueba si la password es fuerte o no segun los criterios indicados
	 */	
	public boolean esFuerte() {
		int numeros = 0;
		int mayusculas = 0;
		int minusculas = 0;
		
		for (int i = 0; i < this.longitud; i++) {
			if(Character.isLowerCase(this.contrasena.charAt(i))) {
				minusculas++;
			}else if (Character.isUpperCase(this.contrasena.charAt(i))) {
				mayusculas++;
			}else if(Character.isDigit(this.contrasena.charAt(i))) {
				numeros++;
			}			
		}

		if(numeros >= 5 && mayusculas >= 2 && mayusculas >= 1 ) {
			return true;
		}
		
		return false;
	}
	
	public void generarPassword() {
		
	}
	

}
