package java_01;

import java.util.Scanner;

public class IfEx01_02 {

	public static void main(String[] args) {

		// (예제) 입력받은 값이 홀수인지 짝수인지 판단하시오.

		Scanner sc = new Scanner(System.in);

		// 1. if 굳이 2개의 if문 사용
		System.out.print("입력 (if) : ");
		int input1 = sc.nextInt();

		if (input1 % 2 == 1) {
			System.out.println("홀수입니다.");
		}

		if (input1 % 2 == 0) {
			System.out.println("짝수입니다.");
		}


		// 2. if-else 가장 적합
		System.out.print("입력 (if-else) : ");
		int input2 = sc.nextInt();

		if (input2 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}


		// 3. if-else if 굳이 들어가지 않아도 돼는 부분이 들어가 있음
		System.out.print("입력 (if-else if) : ");
		int input3 = sc.nextInt();

		if (input3 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else if (input3 % 2 == 0) {
			System.out.println("짝수입니다.");
		}

		sc.close();

	}

}