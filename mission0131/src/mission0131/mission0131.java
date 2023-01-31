package mission0131;

import java.util.Scanner;

class car {

	protected String name = null;
	protected String color = null;
	protected int number = 0;
	protected String address = null;
	protected int velocity = 0;

}

class lentcar extends car {
	int fare = 0;
	String comp = null;
}

public class mission0131 {

	public static void main(String[] args) {
		lentcar a = new lentcar();

		Scanner sc = new Scanner(System.in);
		System.out.print("자동차 종류를 입력하세요:");
		a.name = sc.nextLine();
		System.out.print("자동차 색깔을 입력하세요:");
		a.color = sc.nextLine();
		System.out.print("자동차 번호를 입력하세요:");
		a.number = sc.nextInt();
		sc.nextLine();
		System.out.print("운전자 주소를 입력하세요:");
		a.address = sc.nextLine();
		System.out.print("자동차 속도를 입력하세요:");
		a.velocity = sc.nextInt();
		System.out.print("렌트비를 입력하세요:");
		a.fare = sc.nextInt();
		sc.nextLine();
		System.out.print("렌트회사를 입력하세요:");
		a.comp = sc.nextLine();
		System.out.printf("\n자동차종류 : %s\n", a.name);
		System.out.printf("자동차색깔 : %s\n", a.color);
		System.out.printf("자동차번호 : %d\n", a.number);
		System.out.printf("운전자주소 : %s\n", a.address);
		System.out.printf("현재 자동차 속도는 시속 %dkm/h입니다.\n", a.velocity);
		System.out.printf("렌트요금 : %d\n", a.fare);
		System.out.printf("렌트회사명 : %s\n", a.comp);

		System.out.print("\n속도를 얼마나 올리시겠습니까 : ");
		int plus = sc.nextInt();
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h입니다.", a.velocity + plus);
		System.out.print("\n속도를 얼마나 내리시겠습니까 : ");
		int minus = sc.nextInt();
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h입니다.", a.velocity + plus - minus);

	}

}
