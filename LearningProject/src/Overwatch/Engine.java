package Overwatch;

public class Engine {

	public static void main(String[] args) {
		
		Food belgWaffle = new Food ("Belgian Waffles", 6, "Two of our famous Belgian Waffles with plenty of real maple syrup", 650);
		
		System.out.println("<breakfast_menu>");
		System.out.println("<food>");
		System.out.println("<name>" + belgWaffle.getPrice() + "</name>");
		System.out.println("<price>" + belgWaffle.getPrice() + "</price>");
		System.out.println("</food>");
		System.out.println("</breakfast_menu>");
		
	}
	

}
