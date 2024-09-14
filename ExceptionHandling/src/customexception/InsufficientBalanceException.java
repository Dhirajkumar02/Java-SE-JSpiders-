package customexception;

public class InsufficientBalanceException extends Exception {
	private String message;
	
	InsufficientBalanceException(String message){
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
