package day09.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		
		//Chef chef = new Chef();
		
		Hotel hotel = new Hotel(new Chef());
		
		//setter
		hotel.setChef(new Chef());
		
		//getter
		Chef c = hotel.getChef();
		c.cooking();
	}
}
