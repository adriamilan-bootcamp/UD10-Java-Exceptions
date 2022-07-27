import javax.swing.JOptionPane;

import calculo.Calculadora;

public class mainApp {

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		String op = JOptionPane.showInputDialog(null, "1.Suma 2.Resta 3.Multiplicacion 4.Potencia 5.Raiz cuadrada 6.Raiz cubica 7.Division q. Salir");
		try {
			if(op.equals("q")) {
				System.exit(0);
			}
			Calculadora calc = new Calculadora();
			
			switch (Integer.parseInt(op)) {
			case 1:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.suma());
				break;
			case 2:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.restar());			
				break;
			case 3:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.multiplicar());
				break;
			case 4:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.potencia());
				break;
			case 5:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.raizCuadrada());
				break;
			case 6:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.raizCubica());
				break;
			case 7:
				calc = pedirNumero(calc);
				JOptionPane.showMessageDialog(null, "Resultado: "+calc.dividir());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				menu();
				break;
			}
			
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println("Input no valido "+ex);
			menu();
		}
		
	}
	
	private static Calculadora pedirNumero(Calculadora calc) {
		try {
			calc.setNumero1(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1")));
			calc.setNumero2(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2")));
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println("Input no valido "+ex);
			return pedirNumero(calc);
		}
		
		return calc;
	}
	
}
