package day08.overriding.basic2;

public class Teacher extends Person {

	String subject;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
