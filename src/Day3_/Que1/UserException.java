package Day3_.Que1;

public class UserException extends Exception {
	public UserException() {
		
	}
	
	public UserException(String message) {
		
		super(message);
		System.out.println(message);
	}
	

}
