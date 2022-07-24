import javax.swing.JOptionPane;

import password.Password;

public class mainApp {

	public static void main(String[] args) {
		
		// Llamamos al metodo que genera las passwords y verifica si son fuertes o no mostrandolo por pantalla.
		inputOutput();
		
	}
	
	public static void inputOutput() {
		
		// Pedimos al usuario el numero de passwords que quiere generar
		int nPasswords = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de passwords que quieres generar"));
		// Generamos un array con la cantidad de passwords elegida
		Password[] passwords = new Password[nPasswords];
		// Generamos un array para saber si cada password es fuerte o no
		boolean[] fuerte = new boolean[nPasswords];
		
		// Para cada posicion de la array de pass
		for (int i = 0; i < nPasswords; i++) {
			// Generamos una password con la longitud que el usuario quiere
			passwords[i] = new Password(Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de tu contraseña"));
			// Asignamos en cada posicion si la password es fuerte o no
			fuerte[i] = passwords[i].esFuerte();
			// Mostramos por pantalla todo lo generado anteriormente
			System.out.println("Password" + (i+1) + " " + passwords[i].getPassword() + " " + fuerte[i]);
		}
	}
	
}
