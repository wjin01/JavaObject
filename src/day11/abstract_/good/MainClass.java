package day11.abstract_.good;

public class MainClass {

	public static void main(String[] args) {
		
		//추상클래스는 객체생성 안 됨
		//추상클래스를 사용하려면
		//자식으로 생성해서 부모타입에 저장하고 이것을 객체 추상화라고 부름
//		Store s = new Store();
		Store s = new BusanStore(); //다형성 
		
		s.melon();
		s.apple();
		s.orange();
		s.mango(); //부모한테 상속받은 메서드
		String name = s.getName(); //부모한테 상속받은 메서드
		System.out.println(name);
		
	}
}
