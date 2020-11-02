import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Tolo {
	private String DateT;
	private ArrayList<Integer> numTolo = new ArrayList<Integer> (4);
	
	public Tolo(String DateT) {
		this.DateT=DateT;
		}
	
	/*public String initDate(String DateT) {
		SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
		String dateAujourdhui=date.format(System.currentTimeMillis());
		return DateT;
	}*/
	
	public String getDate() {
		return this.DateT;
	}
	
	public ArrayList<Integer> getNumero(){
		return this.numTolo;
	}
	
	public void initTolo() {
		for (int i=0;i<4;) {
			Random r = new Random();
			int numT=r.nextInt(20)+1;
			if(numTolo.contains(numT)==false) {
			numTolo.add(numT);
			i++;
			}
		}
	}

	//Comparer avec Grille
	public int comparerNumero(Grille grilles) {
		int bonus;
		int mise = grilles.getMise();
		ArrayList<Integer> list = (ArrayList<Integer>)grilles.getNumGrille().clone();
		list.retainAll(numTolo); // Pour comparer il y a combien de meme numero dans les deux listes
		int nbFois=list.size();
		bonus=mise;
		if(nbFois==3) {
			bonus=mise*5;
		}
		else if(nbFois==4) {
			bonus=mise*50;
		}else {bonus=0;}
		return bonus;
	}
}
