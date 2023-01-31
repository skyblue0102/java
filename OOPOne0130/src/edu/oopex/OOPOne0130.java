package edu.oopex;

import java.util.Scanner;

class Person {
	private final int IQ = 140;
	private String name = null;
	private int age = 0;

	static char blood = 'A';

	public static void display() {

		System.out.printf("blood=%c\n", blood);
//		System.out.printf("\ndisplay 메서드만 name=%s\n", name);//error
	}

	public Person() {// 기본 생성자함수 ..매개변수가 없다.

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
}

public class OOPOne0130 {

	public static void main(String[] args) {
		int val[] = new int[] { 10, 20, 30 };
		int vals[] = new int[3];
		vals[0] = 10;
		vals[1] = 20;
		vals[2] = 30;
		Person gildong = new Person();
		gildong.talk();
		gildong.talk("화이팅\n");
		gildong.setage(24);
		gildong.talk("나의 나이는", gildong.getage());
		gildong.talk(gildong.getage(), "\n나의 나이는");

		Scanner sc = new Scanner(System.in);
		System.out.print("\n이름을 입력하세요:");
		String myname = sc.nextLine();
		System.out.print("나이를 입력하세요:");
		int myage = sc.nextInt();
		Person Hyunbin = new Person(myname, myage);
//		hyunbin.display();
		Person.display();

		System.out.printf("Hyunbin.name=%s\n", Hyunbin.getname());
		System.out.printf("Hyunbin.age=%d\n", Hyunbin.getage());
	}

}
