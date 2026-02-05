package hi;

public class underAgeException extends Exception {

	private static final long serialVersionUID = -3794222121190814212L;

	public underAgeException() {
		super("Parent is too young");
		// TODO Auto-generated constructor stub
	}

	public underAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public underAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


}
