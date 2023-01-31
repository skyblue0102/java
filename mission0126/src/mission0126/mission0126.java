package mission0126;

import java.util.Scanner;

public class mission0126 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = null;
		String name2 = null;
		String address = null;
		double English = 0.0;
		double Physics = 0.0;
		double Calculus = 0.0;

		System.out.print("이름을 입력하세요 !! : ");
		name = sc.nextLine();

		System.out.print("학과명을 입력하세요 !! : ");
		name2 = sc.nextLine();

		System.out.print("영어 점수 입력: ");
		English = sc.nextDouble();

		System.out.print("물리학 점수 입력: ");
		Physics = sc.nextDouble();

		System.out.print("미적분학 점수 입력: ");
		Calculus = sc.nextDouble();

		sc.nextLine();

		System.out.print("주소를 입력하세요 !! : ");
		address = sc.nextLine();

		System.out.printf("이름=%s, ", name);
		System.out.printf("학과명=%s\n", name2);
		System.out.printf("영어 성적=%.1f, ", English);
		System.out.printf("물리학 성적=%.1f, ", Physics);
		System.out.printf("미적분학 성적=%.1f\n", Calculus);
		System.out.printf("총점=%.1f", (double) (English + Physics + Calculus));
		System.out.printf("평균=%.1f\n", (double) ((English + Physics + Calculus) / 3));
		System.out.printf("주소=%s", address);

	}

}
