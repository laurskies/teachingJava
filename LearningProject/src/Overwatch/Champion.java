package Overwatch;

public class Champion {

	private String champName;
	private int champMaxHP;
	private int champCurrHP;
	private int champDamage;
	
	public Champion(String name, int HP, int damage) {
		this.champName = name;
		this.champMaxHP = HP;
		this.champCurrHP = champMaxHP;
		this.champDamage = damage;
	}
	
	public void takeDamage(int damage) {
		this.champCurrHP = champCurrHP - damage;
	}
	
	public void heal(int healing) {
		this.champCurrHP = champCurrHP + healing;
		if (champCurrHP > champMaxHP)
			champCurrHP = champMaxHP;
	}
	
	public void healToFull() {
		this.champCurrHP = champMaxHP;
	}

	public String getChampName() {
		return champName;
	}

	public void setChampName(String champName) {
		this.champName = champName;
	}

	public int getChampDamage() {
		return champDamage;
	}

	public void setChampDamage(int champDamage) {
		this.champDamage = champDamage;
	}

	public int getChampCurrHP() {
		return champCurrHP;
	}

	public int getChampMaxHP() {
		return champMaxHP;
	}

	public void setChampMaxHP(int champMaxHP) {
		this.champMaxHP = champMaxHP;
	}
	
	
}
