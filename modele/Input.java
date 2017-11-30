package modele;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import exception.NombreEntierPositifException;

public class Input {
	
	private Scanner scan;
	private List<Double> param;
	
	public Input() {
		scan = new Scanner(System.in);
		param = new ArrayList<>();
	}
	
	//Méthode appelée deux fois pour avoir le nombre de paramètre et le nombre de constante
	public List<Double> lireEquation() {
		param.clear();
		scan.nextLine();
		return param;
	}
		
		
	
	
	//Méthode appelée xfois permettant d'avoir la fonction Z et les x contraintes
	public String getFonction() {
		String z = scan.nextLine();
		return z;
	}
	
	
	

}
