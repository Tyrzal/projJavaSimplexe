package vue;

import exception.DoublonException;
import modele.Input;
import modele.Matrice;

public class MainTest {
	
	public static void main(String[]args) {
		Input in = new Input();
		Matrice m = new Matrice();
		System.out.println("Veuillez encoder la contrainte");

		try {
			m.add(in.lireEquation());
		} catch (DoublonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(m.toString());
		
	}

}
