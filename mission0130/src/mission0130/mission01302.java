package mission0130;

import java.util.Scanner;

class car {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String color;
	private int number;
	private String address;
	private int velocity;

	public void setName() {
		System.out.printf("차 이름을 입력하시오:");
		name = sc.next();
	}

	public String getName() {
		return name;
	}

	public void setColor() {
		System.out.printf("차 색을 입력하시오:");
		color = sc.next();
	}

	public String getColor() {
		return color;
	}

	public void setNumber() {
		System.out.printf("차량번호를 입력하시오:");
		number = sc.nextInt();
	}

	public int getNumber() {
		return number;
	}

	public void setAddress() {
		System.out.printf("운전자 주소를 입력하시오:");
		sc.nextLine();
		address = sc.nextLine();
	}

	public String getAddress() {
		return address;
	}

	public void setVelocity() {
		System.out.printf("속도를 입력하시오:");
		velocity = sc.nextInt();
	}

	public int getVelocity() {
		return velocity;
	}

}

public class mission01302 {

	public static void main(String[] args) {
		car c = new car();
		c.setName();
		c.setColor();
		c.setNumber();
		c.setAddress();
		c.setVelocity();

		System.out.printf("차 이름:%s\n", c.getName());
		System.out.printf("차 색:%s\n", c.getColor());
		System.out.printf("차량 번호:%d\n", c.getNumber());
		System.out.printf("운전자 주소:%s\n", c.getAddress());
		System.out.printf("속도 :%d", c.getVelocity());
	}

}
