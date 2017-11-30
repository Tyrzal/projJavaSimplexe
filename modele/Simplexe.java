package modele;

import java.util.List;
import java.util.ArrayList;

public class Simplexe {
	
	public Simplexe() {}
	
	public void resolution(Matrice matrice) {
		boolean resolu=false;
		int colPivot, ligPivot;
		while(!resolu) {
			colPivot=colonnePivot(matrice);
			
		}
		
	
	}
	
	public int colonnePivot(Matrice matrice) {
		int retour=-1;
		List<Double> tmp=new ArrayList<>();
		int size = matrice.getList().size();
		tmp=(List<Double>) matrice.getList().get(size);
		return retour;
	}
	

	

}
