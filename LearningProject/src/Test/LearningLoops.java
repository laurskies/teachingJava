package Test;

public class LearningLoops {

	public static void main(String[] args) {
		//Soldier Stats
		String soldierName = "Soldier 76";
		int soldierCurrentHP = 200;
		int soldierMaxHP = 200;
		int soldierDamage = 20;
		
		//Sombra Stats
		String sombraName = "Sombra";
		int sombraCurrentHP = 200;
		int sombraMaxHP = 200;
		int sombraDamage = 11;
		
		int shots = 0;
		
		while (sombraCurrentHP > 0) {
			//System.out.println("Alive");
			//System.out.println(sombraCurrentHP);
			
			sombraCurrentHP = sombraCurrentHP - soldierDamage;
			shots = shots + 1;
		}
		System.out.println("It took " + shots + " to kill Sombra");
		
	}
}
