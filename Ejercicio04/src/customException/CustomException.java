package customException;

public class CustomException extends Exception {
	
	private int codigoError;
	
	public CustomException() {
		super();
		this.codigoError = 0;
	}
	
	public CustomException(int codigo) {
		super();
		this.codigoError = codigo;
	}
	
	@Override
	public String getMessage() {
		
	}
	
}
