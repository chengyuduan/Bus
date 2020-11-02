
public class Joueur {
	private String nomJoueur;
	private String prenomJoueur;
	
	public Joueur(String nomJoueur, String prenomJoueur) {
		this.nomJoueur=nomJoueur;
		this.prenomJoueur=prenomJoueur;
	}
	
	public String getNom() {
		return this.nomJoueur;
	}
	public String getPrenom() {
		return this.prenomJoueur;
	}
}
