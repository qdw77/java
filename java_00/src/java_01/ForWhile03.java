package java_01;

import java.util.Scanner;
//import java.util.HashMap;

public class ForWhile03 {

	public static void main(String[] args) {
//private static void main(String[] args) 패키지 내부에서만 가능
		// 정수를 입력 받아 구구단을 출력해 보세요.
		//단 1~9까지만 허용
		//HashMap map = new HashMap();
		Scanner sc = new Scanner(System.in);
		//생성자 new/
		System.out.print("어떤 단수의 구구단을 출력할까요 : ");
		
		int dan = sc.nextInt();
		if(dan >=1 && dan < 10 ) {
		
		// while 문 활용
//		System.out.println("====== [ while문 ] " + dan + " 단 ==========");
//		
//		int hang = 1; //초기화 1값
//		while (hang <= 9) {
//			int result =0;
//			result = dan * hang;
//			System.out.println(dan+ "*" + hang + "=" + result);
//			hang ++;
//		}
		
		
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] " + dan + " 단 ==========");
		
		for (int i = 1; i<9; i++) {
			int result =0;
			result = dan * i;
			System.out.println (dan + "*" +i + "=" +result);
		}  }else {
			System.out.println ("1단부터 9단까지만 입력이 가능합니다.");
		}
		
		
		
		sc.close();
		
	}

}