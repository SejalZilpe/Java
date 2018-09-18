package ExceptionExample;

public class PasswordExceptionValidate extends Exception {
	private static final long serialVersionUID = 1L;

	PasswordExceptionValidate ()
	{
		super("password incorrect");
	}
}
