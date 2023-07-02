package Test;
import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many shots/swings are we doing?");
		int shots = reader.nextInt();
		
		
		//Reinhardt
		int reinHP = 625;
		int reinSwingDamage = 70;
		
		//Soldier
		int soldierHP = 200;
		int soldierBulletDamage = 20;
		
		System.out.println(dealDamage(reinHP, soldierBulletDamage, shots));

		System.out.println(dealDamage(soldierHP, reinSwingDamage, shots));
		
		reader.close();
	}
	
	public static int dealDamage(int HP, int damage, int shots) 
	{
		HP = HP-(shots*damage);
		
		return HP;
	}

}
