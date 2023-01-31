package mission0127;

public class mission0127 {

	public static void main(String[] args) {

		int dan = 2, val = 1;

		for (val = 1; val <= 9; ++val) {

			for (dan = 2; dan <= 5; ++dan) {
				System.out.printf("%d*%d=%d\t", dan, val, dan * val);

			}

			System.out.printf("\n");
		}

		System.out.printf("\n");

		for (val = 1; val <= 9; ++val) {

			for (dan = 6; dan <= 9; ++dan) {
				System.out.printf("%d*%d=%d\t", dan, val, dan * val);

			}

			System.out.printf("\n");
		}
		System.out.printf("계속하려면 아무 키나 누르십시오...");
	}

}
