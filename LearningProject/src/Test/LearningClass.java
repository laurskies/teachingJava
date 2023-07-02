package Test;

// Create an interger called Age.
// Output: If this person can buy alcohol.
// 
// 
// Soldier 
// JunkerQueen

public class LearningClass {

	public static void main(String[] args) 
	{
		int damage = 250;
		
		//Sombra Stats
		String sombra = "Sombra";
		int sombraHP = 200;
		
		//Reinhardt Stats
		String rein = "Reinhardt";
		int reinHP = 600;

		String gotOneShot = " got One Shot";
		String didntGetOneShot = " is still alive";
		
		if (damage < reinHP) 
		{
			System.out.println(rein + didntGetOneShot);
			System.out.println(rein + didntGetOneShot);
			System.out.println(rein + didntGetOneShot);
			if (damage < reinHP)
			{
				System.out.println(rein + didntGetOneShot);
			}
		}
		else if (damage >= reinHP) 
		{
			System.out.println(rein + gotOneShot);
		}
		
		if (damage < sombraHP) 
		{
			System.out.println(sombra + didntGetOneShot);
		} 
		else if (damage >= sombraHP) 
		{
			System.out.println(sombra + gotOneShot);
		}
	}
}
