import java.util.ArrayList;
import java.util.Scanner;
public class SuperGrille extends Grille {	
	
	public SuperGrille(Joueur joueurs, int mise) {
		super(joueurs, mise);
		// TODO Auto-generated constructor stub
	}

	private int numSG;
	


	
	
	public int getNumeroSG() {

		return this.numSG;
	}
	// pour ajouter grille et le numero de chance dans le supergrille
	public void initSuperGrille() {
		super.initGrille();
		for(int i=0; i<1;){
			Scanner numSaisie= new Scanner(System.in);
			System.out.println("Veuillez saisir un numero entre 1 - 10 :");
			int c = numSaisie.nextInt();
			if(c<=10&c>0) {
			numSG=c;
			i++;
			}
	}
	}
}
