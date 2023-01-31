package edu.gugudan;

public class GuGuDanEx0127 {

	public static void main(String[] args) {

		int dan = 2, val = 1;
		for (dan = 2; dan <= 9; ++dan) {
			for (val = 1; val <= 9; ++val) {
				if (val == 4)
					break;
				System.out.printf("%d*%d=%d\n", dan, val, dan * val);
			}
		}
		for (int i = 1; i <= 10; ++i) {
//			if (i == 6)
//			break;
			if (i == 4)
				continue;
			System.out.printf("i=%d\t", i);
		}

	}
}