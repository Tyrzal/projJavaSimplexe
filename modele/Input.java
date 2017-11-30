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
	
	//Méthode appelée pour la fonction Z et pour les contraintes
	public List<Double> lireFonction() {
		param.clear();
		String str = scan.nextLine();
		int n=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				param.add(Double.parseDouble(str.substring(i-n, i)));
				n=0;
			}
			else if (i==str.length()-1){
				param.add(Double.parseDouble(str.substring(i-n, str.length())));
			}
			else{
				n++;
			}
		}	
		return param;
	}
	
	//Définis le nombre de paramètres des contraintes et le nombre de contraintes
	public int definirProbleme() {
		int retour = scan.nextInt();
		scan.nextLine();
		return retour;
	}
	
	
	

}
