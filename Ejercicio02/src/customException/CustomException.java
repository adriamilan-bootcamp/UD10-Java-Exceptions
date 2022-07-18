package customException;

public class CustomException extends Exception {
	
	private String messageException;
	
	public CustomException() {
		
	}
	
	/*
	 * @return Devuelve el mensaje introducido en el constructor de la clase CustomException
	 */
	@Override
	public String getMessage() {
		return this.messageException;
	}
	
}
