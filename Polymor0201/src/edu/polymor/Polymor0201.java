package edu.polymor;

abstract class mammal {

	abstract public void moving();

	public mammal() {
		System.out.println("난 mammal 기본 생성자");
	}

	public void talk() {

	}

	public void show() {
		System.out.println("난 mammal의 show()");
	}
}

class Person extends mammal {
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

		super();// mammal
		System.out.println("난 매개변수 두개인 Person 생성자");
		this.name = name;
		this.age = age;
	}

	public void setname(String name) {
		this.name = name;
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
//		name = "아무개";
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

	public void show() {
		super.show();
		System.out.printf("this.name=%s, age=%d\n", name, age);
		System.out.println("난 Person의 show()메서드");
	}

	public void moving() {
		System.out.println("Person이 움직인다");
	}

}// end of class Person

class Man extends Person {
	private int money;
	private String job;
	private int IQ = 150;

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public Man() {
		super();
		System.out.println("난 man의 기본 생성자");
	}

	public Man(String name, int age, int money, String job) {

//		super();// person() 호출하라!
		// person(name, age);
		super(name, age);
		System.out.println("난 인자4개인 Man생성자");
//		this.name = name;
//		this.age = age;
		this.money = money;
		this.job = job;

	}

	public void show() {
		super.show();
		System.out.printf("Person의 IQ=%d\n", super.IQ);
		System.out.printf("Man의 IQ=%d\n", this.IQ);
//		System.out.printf("this.name=%s, age=%d\n", name, age);
		System.out.printf("money=%d,job=%s\n", money, job);
	}

	public void work() {
		System.out.println("Man이 일한다.");
	}

	public void moving() {
		System.out.println("Man이 움직인다");
	}

}// end of Man

public class Polymor0201 {

	public static void main(String[] args) {

//		Man jaesuk =
//		Person jaesuk =
		mammal jaesuk = new Man("유재석", 51, 70000, "국민MC");
		jaesuk.talk();// person의 talk()
		jaesuk.show();// Man의 show()
		jaesuk.moving();

	}

}
