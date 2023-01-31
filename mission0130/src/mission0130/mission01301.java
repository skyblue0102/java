package mission0130;

import java.util.Scanner;

public class mission01301 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lotto, count = 0;
		int val[] = new int[6];

		for (int k = 0; k < 6;) {
			count = 0;
			System.out.print("로또번호 입력:");
			val[k] = sc.nextInt();

			for (lotto = 0; lotto < k; ++lotto) {
				if (val[k] == val[lotto]) {
					System.out.print("같은 번호가 있습니다!\n");
					count++;
					break;
				}

			}
			if (count == 0)
				k++;

		}
		System.out.print("입력된 로또번호:");
		for (int i = 0; i < 5; i++)
			System.out.printf("%d, ", val[i]);
	}
}
