package edu.switchone;

public class SwitchOne0127 {

	public static void main(String[] args) {
		int score = 90;
		int share = score / 10;

		switch (share) {
		case 10:
			System.out.println("A학점");
			break;
		case 9:
			System.out.println("B학점");
//			break;
		case 8:
			System.out.println("C학점");
			break;
		case 7:
			System.out.println("D학점");
			break;

		case 6, 5, 4, 3, 2, 1, 0:
			System.out.println("F학점");
			break;

		}

	}

}
