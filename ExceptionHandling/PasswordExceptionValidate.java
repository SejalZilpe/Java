package ExceptionHandling;

public class PasswordExceptionValidate extends Exception {

	PasswordExceptionValidate (String str)
	{
		super("password length must be greater than 8 .");
	}
}
