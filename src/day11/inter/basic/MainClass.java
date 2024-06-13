package day11.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method01();
		b.method02();
		b.method03();
		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);
		
		System.out.println("--------------------");
		/*
		 * 인터페이스도 다형성처럼 부모타입으로 사용할 수 있음
		 * 
		 * -> 부모타입에 있는 기능만 사용할 수 있고 오버라이딩된 메서드는 먼저 실행
		 */
		Inter1 i1 = new Basic();
		i1.method01();
//		i1.method02();
		
		System.out.println("--------------------------");
		/*
		 * 인터페이스도 클래스 캐스팅을 할 수 있음
		 */
		Basic bb = (Basic)i1;
	}
}
