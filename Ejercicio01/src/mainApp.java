import java.io.IOException;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class mainApp {
	
	public static void main(String[] args) {
		adivinarNumero(new NumeroAleatorio());
	}
	
	/*
	 * Metodo que recibe un numero aleatorio y hace que el usuario introduzca numeros hasta adivinarlo.
	 * @param numero aleatorio recibido.
	 */
	public static void adivinarNumero(NumeroAleatorio numAleatorio) {	
		
		int userNum = Integer.MIN_VALUE;
		int intentos = 0;
				
		while(userNum!= numAleatorio.getValor()) {
			try {
				userNum = Integer.parseInt(JOptionPane.showInputDialog(null,"[Adivina el numero secreto]\nIntroduce un numero:"));
				
				if(userNum > numAleatorio.getValor()) {
					JOptionPane.showMessageDialog(null,"El numero que tienes que adivinar es menor al que has introducido");
				}else if (userNum < numAleatorio.getValor()) {
					JOptionPane.showMessageDialog(null,"El numero que tienes que adivinar es mayor al que has introducido");				
				}
				
				intentos++;
		
			}catch (InputMismatchException e){
				System.out.println(e);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
		JOptionPane.showMessageDialog(null,"¡Has adivinado el numero en "+intentos+"  intentos!, el numero secreto era "+userNum);				
	}
}
