package java_01;

import java.util.Scanner;

public class Switch02_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 31일 입니다.
		// -----------------------------------------------------

		
		System.out.println("월(달)을 입력하세요.");
		int num = sc.nextInt();
		
		switch (num) {
		case 1, 3, 5, 7, 8, 10, 12 :
			System.out.println("2024년도" + num + "월의 마지막 날짜는 31일 입니다.");
			break;
		case 2 :
			System.out.println("2024년도" + num + "월의 마지막 날짜는 29일 입니다.");
			break;
		case 4, 6, 9, 11 :
			System.out.println("2024년도" + num + "월의 마지막 날짜는 30일 입니다.");
			break;
		default :
			System.out.println("달(월)은 1월 ~ 12월 까지만 있어요.");
		}
		
		
		
		// 동일한 조건식을 if문으로 작성해보기
		
		
		System.out.println("월(달)을 입력하세요.");
		
		int score = sc.nextInt ();

		
		if (score == 1 || score == 3 || score == 5 || score == 7 || score == 8 || score == 10 || score == 12) {
			System.out.println("2024년도" + score + "월의 마지막 날짜는 31일 입니다.");
		} else if (score == 2){
			System.out.println("2024년도" + score + "월의 마지막 날짜는 29일 입니다.");
		} else if (score == 4 || score == 6 || score == 9 || score == 11){
			System.out.println("2024년도" + score + "월의 마지막 날짜는 30일 입니다."); 
		} else {
			System.out.println("달(월)은 1월 ~ 12월 까지만 있어요.");
		}


		sc.close();
		

	}

}