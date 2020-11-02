import java.util.ArrayList;
import java.util.Scanner;
public class Grille {
	private int mise;
	private ArrayList<Integer> numGrille = new ArrayList<Integer> (4);
	private int i=0;
	Joueur joueurs;

	public int getMise() {
		return this.mise;
	}
	
	public Joueur getJoueur() {
		return this.joueurs;
	}
	
	public ArrayList<Integer> getNumGrille(){
		return this.numGrille;
	}
	public Grille(Joueur joueurs, int mise) {
		this.joueurs= joueurs;
		this.mise=mise;
	}
	//initialisation du grille, l'utilisateur peut choisir 4 numeros
	public void initGrille() {
		for(i=0; i<4;){
			Scanner numSaisie= new Scanner(System.in);
			System.out.println("Veuillez saisir 4 numero entre 1 - 20 :");
			int c = numSaisie.nextInt();
			if(c<=20&c>0&numGrille.contains(c)==false) {
			numGrille.add(c);
			i++;}
			if(c>20) {
				System.out.println("Veuillez saisir un numero inferieur a 20");
			}
			if(c<0) {
				System.out.println("Veuillez saisir un numero superieur a 0");
				
			}
		}
	}
	
}
