package day09.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
//		me.setYear(2025);
		me.setYear(2001);
		me.setMonth(8);
		me.setDay(19);
		me.setSsn("010819-1234567");
		
		int year = me.getYear();
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println("년도: " + year);
		System.out.println(month + " 월");
		System.out.println(day + " 일");
		System.out.println("주민번호: " + ssn);
		
		
	}
}
