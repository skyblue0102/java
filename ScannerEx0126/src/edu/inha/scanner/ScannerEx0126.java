package edu.inha.scanner;

import java.util.Scanner;

public class ScannerEx0126 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = 0;
		char blood = '\0';
		double height = 0.0;
		String name = null; // String name = 0 ;

		System.out.print("나이를 입력 : ");
		age = sc.nextInt();
		System.out.printf("age=%d\n", age);

		sc.nextLine(); // enter문자를 삭제하기 위한 목적

		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.printf("name=%s\n", name);

		System.out.print("혈액형 입력 : ");
		blood = sc.next().charAt(0);
		System.out.printf("blood=%c\n", blood);

		System.out.print("키값 입력: ");
		height = sc.nextDouble();
		System.out.printf("height=%.2f\n", height);

	}

}
