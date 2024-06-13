package day12.exception.trycatch;

public class TrycatchEx02 {
	
	public static void main(String[] args) {
		
		//반복문에서 예외처리
		
		String[] arr = {"홍길동", "홍길자", "이순신"};
		
		int i = 0;
		
		while(i < 4) {
			
			try {				
				System.out.println(arr[i]);
			} catch (Exception e) { //모든 예외 전부 처리
				System.out.println("배열 참조범위를 벗어남");
			} finally {
				System.out.println("예외여부 상관없이 실행"); //자원해제 할 때 많이 사용
			}
			i++;
		}
		System.out.println("프로그램 정상종료");
	}

}
