package exception;

public class OddNumberException extends Exception{
	
	public int number;
	
	public OddNumberException(int number) {
		super("The number entered is not even:"+number);
	}

	
}
