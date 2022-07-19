package customException;

public class CustomException extends Exception {
	
	private String messageException = "Default Error";
	
	public CustomException(String errorMessage) {
		this.messageException = errorMessage;
	}
	
	/*
	 * @return Devuelve el mensaje introducido en el constructor de la clase CustomException
	 */
	@Override
	public String getMessage() {
		return this.messageException;
	}
	
}
