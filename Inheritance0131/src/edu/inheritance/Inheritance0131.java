package edu.inheritance;

class Person {
	protected final int IQ = 140;
	protected String name = null;
	protected int age = 0;

	static char blood = 'A';

	public static void display() {

		System.out.printf("blood=%c\n", blood);
//		System.out.printf("\ndisplay 메서드만 name=%s\n", name);//error
	}

	public Person() {// 기본 생성자함수 ..매개변수가 없다.
		System.out.println("난 person의 기본 생성자");
		name = null;
		age = 0;
	}

	public Person(String name, int age) {
		System.out.println("난 매개변수 두개인 Person 생성자");
		this.name = name;
		this.age = age;
	}

	public void setname(String name_1) {
		name = name_1;
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return this.age;
	}

	public void talk() {
		System.out.println("talk() 메서드이다.");
	}

	public void talk(String shouting) {
		System.out.printf("%s", shouting);
	}

	public void talk(String shouting, int b) {
		System.out.printf("%s %d", shouting, b);
	}

	public void talk(int b, String shouting) {
		System.out.printf("%s %d", shouting, b);
	}

	public void breathe() {
		age = 1;
	}
}// end of class Person

class Man extends Person {
	private int money;
	private String job;

	public Man() {
		System.out.println("난 man의 기본 생성자");
	}

	public void show() {
		System.out.printf("name=%s\n", name);
		System.out.printf("money=%d\n", money);
		System.out.printf("job=%s\n", job);
	}

	public void work() {
		System.out.println("Man이 일한다.");
	}
}

public class Inheritance0131 {

	public static void main(String[] args) {

		Person chulsu = new Person();
		chulsu.name = "철수";
		System.out.printf("chulsu.name=%s\n", chulsu.name);

		Man wonbin = new Man();
		wonbin.setname("원빈");
		wonbin.work();
		System.out.printf("wonbin.name=%s\n", wonbin.getname());

	}
}
