package customexception;

public class InvalidMarksException extends Exception {
	private String message;

	InvalidMarksException (String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
