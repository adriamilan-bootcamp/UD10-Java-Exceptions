package customException;

public class CustomException extends Exception {
	
	private String messageException;
	
	public CustomException() {
		
	}
	
	@Override
	public String getMessage() {
		
		return messageException;
	
	}
	
}
