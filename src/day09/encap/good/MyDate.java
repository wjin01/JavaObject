package day09.encap.good;

public class MyDate {


	public int year;
	public int month;
	public int day;
	public String ssn; //주민번호
	
	
	/*
	 * 은닉된 변수의 값을 사용할 때는 getter/ setter 를 사용
	 * 
	 * setter
	 * 1.은닉 변수에 값을 저장할 메서드
	 * 2.접근제어자는 public으로 선언하고 이름은 set + 멤버변수명
	 */
	
	public void setYear(int year) {
		//setter를 사용하면 유효성 검증코드를 넣을 수도 있다
		if(year < 1 || year > 2024) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		this.year = year; 	
	}
	
	
	/*
	 * getter 메서드 선언
	 * 1.은닉변수의 값을 조회하는 메서드
	 * 2.접근제어자 public 선언하고 이름은 get + 멤버변수명
	 */
	
	public int getYear() {
		return year;
	}
	
	/*
	 * 1. month, day, ssn 에 대한 getter/setter 를 생성합니다
	 * month - 1 ~ 12월까지만 저장
	 * day - 1 ~ 31일까지 저장
	 * ssn - "-"은 제거하고 문자열의 길이가 13인 경우만 저장되도록
	 */
	
	public void setMonth(int month) {
		if(month < 0 || month > 13) {
			System.out.println("잘못된 값 입력");
			return;
		}
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	
	public void setDay(int day) {
		if(day < 0 || day > 32) {
			System.out.println("잘못된 값 입력");
			return;
		}
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", ""); //원본에 반영하려면
		if(ssn.length() != 13) {
			System.out.println("잘못된 주민번호 입력");
			return;
		}
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}
}
