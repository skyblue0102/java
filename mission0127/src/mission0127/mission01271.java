package mission0127;

import java.util.Scanner;

public class mission01271 {

	public static void main(String[] args) {

		// 소수 구하기 프로그램

		Scanner sc = new Scanner(System.in);
		int a = 0, i = 2, k = 1, count = 0, count2 = 0;
		System.out.printf("소수를 구할 정수 한개 입력 : ");
		a = sc.nextInt();
		for (i = 2; i <= a; ++i) {
			count = 0;
			for (k = 1; k <= i; ++k) {

				if (i % k == 0) {
					count++;
				}

			}
			if (count == 2) {
				count2++;
				System.out.printf("%d는 소수이다.\n", i);
			}
		}
		System.out.printf("1~%d사이의 소수 개수=%d", a, count2);
	}
}
