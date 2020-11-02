import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Joueur j1 = new Joueur("Zhang","Xingtian");
	// Le joueur choisit quel jeu il veut jouer
	Scanner jeuChoisi= new Scanner(System.in);
	System.out.println("Vous voulez jouer 1.Tolo ou 2.SuperTolo:?");
	int j = jeuChoisi.nextInt();
	if(j==1) {
	Grille g1 = new Grille(j1, 10);
	Tolo t1 = new Tolo("22/09/2020");
	g1.initGrille();
	t1.initTolo();
	int bonus=t1.comparerNumero(g1);
	System.out.println("Date : " + t1.getDate() + " "+ t1.getNumero());
	System.out.println(g1.getJoueur().getNom()+g1.getJoueur().getPrenom()+" Mise : " + g1.getMise()+"  "+g1.getNumGrille());
	System.out.println("Bonus : " + bonus);}
	else if(j==2) {
	SuperGrille sg1 = new SuperGrille(j1,10);
	SuperTolo st1 = new SuperTolo("22/09/2020");
	sg1.initSuperGrille();
	st1.initSuperTolo();
	int bonus1=st1.comparerStSg(sg1);
	System.out.println("Date : " + st1.getDate() + " "+ st1.getNumero()+","+st1.getNumChance());
	System.out.println(sg1.getJoueur().getNom()+sg1.getJoueur().getPrenom()+" Mise : " + sg1.getMise()+"  "+sg1.getNumGrille()+","+sg1.getNumeroSG());
	System.out.println("Bonus : " + bonus1);}
	}
}
