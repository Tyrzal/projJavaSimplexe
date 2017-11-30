package modele;

import java.util.ArrayList;
import java.util.List;

import exception.DoublonException;

public class Matrice {
	
	private List<List<Double>> parametres;
	
	public Matrice() {
		parametres=new ArrayList<List<Double>>();

	}
	
	public List getList() {
		return parametres;
	}
	
	public boolean add(List<Double> liste) throws DoublonException {
		if(!parametres.contains(liste)) {
			return parametres.add(liste);
		}
		throw new DoublonException();
	}
	
	public void placementZ() {
		List<Double> tmp = new ArrayList<>();
		tmp=parametres.get(0);
		parametres.remove(0);
		parametres.add(tmp);
	}

	@Override
	public String toString() {
		return "Matrice [parametres=" + parametres + "]";
	}
	
	


	

}
