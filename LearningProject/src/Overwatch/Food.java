package Overwatch;

public class Food {

	private String name;
	private int price;
	private String desc;
	private int calories;
	
	
	public Food(String n, int p, String d, int c) {
		this.setName(n);
		this.price = p;
		this.desc = d;
		this.calories = c;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
