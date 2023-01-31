package mission0126;

import java.util.Scanner;

public class mission012602 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int years = 0;
		System.out.print("본인 생년을 입력하세요! : ");
		years = sc.nextInt();

		if (years % 4 == 0) {
			System.out.printf("%d년은 윤년입니다.", years);
		} else if (years % 100 != 0 || years % 400 == 0) {
			System.out.printf("%d년은 윤년입니다.", years);
		} else {
			System.out.printf("%d년은 윤년이 아닙니다.", years);
		}
	}

}
