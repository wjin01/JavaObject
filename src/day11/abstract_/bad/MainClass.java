package day11.abstract_.bad;

public class MainClass {
	
	public static void main(String[] args) {
		SeoulStore s = new SeoulStore();
		s.apple();
		s.melon();
		s.orange(); //오버라이딩 되지 않아서 잘못된 메서드가 실행됨
		
	}
	
}
