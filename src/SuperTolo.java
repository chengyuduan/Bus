import java.util.Random;
import java.util.ArrayList;
public class SuperTolo extends Tolo{

	private int numChance;
	public SuperTolo(String DateT) {
		super(DateT);
		
		// TODO Auto-generated constructor stub
	}

	public int getNumChance() {
		return this.numChance;
	}
	
	//Ajouter 4 numero "randome" et un numero de chance dans le supertolo
	public void initSuperTolo() {
			super.initTolo();
			Random r = new Random();
			numChance=r.nextInt(10)+1;
		}
	//Comparer avec supergrille
	public int comparerStSg(SuperGrille supergrilles) {
		int bonus;
		bonus=super.comparerNumero(supergrilles);
		int numSG=supergrilles.getNumeroSG();
		if(numSG==numChance) {
			bonus=bonus*5;
		}
		return bonus;
	}
	}

