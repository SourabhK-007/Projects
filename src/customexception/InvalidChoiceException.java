package customexception;

public class InvalidChoiceException extends RuntimeException{
	private String message;
	public InvalidChoiceException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
