package exception;

public class DoublonException extends Exception{

	public DoublonException() {
		super("Contrainte déjà encodée");
	}
}
