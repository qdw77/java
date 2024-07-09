package java_00;

public class Ex02_printExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*12월 25일은 크리스마스 입니다.
	작년 2023년도 대학 합격률은 72.893 퍼센트 였습니다.
	100이라는 숫자에 10을 더하면 110이 됩니다.
	원주율은 3.141592653589793 이고, 반지름이 5인 원의 둘레는 31.41592653589793 입니다.
	반지름이 5인 원의 넓이는 78.53981633974483 입니다.
	뷁의 문자번호는 48577 입니다.
	58.78945를 버림 하면 58 입니다.
	*/

		int m = 12;
		int d = 25;
		String k = "크리스마스";
		
		System.out.println( m + "월 " + d + "일은 " + k + "입니다.");
		
		int curYear = 2024;
		int varNum = 1;		
		int yearResult;
		yearResult = curYear - varNum;
		
		String p = "대학 합격률은";
		
		double p2 = 72.893;
		
		System.out.println("작년 " + yearResult + "년도 " + p + p2 + " 퍼센트 였습니다. ");
		
		int num1 = 100;
		int num2 = 10;
		int Num;
		
		Num = num1 + num2;
		
		System.out.println( num1 + "이라는 숫자에 " + num2 + "을 더하면 " + Num + "이 됩니다.");
		
		double num3 = 3.141592653589793;
		double num4 = 5;
		double Num2;		
		double Num3;
		
		Num2 = num3 * num4 * 2;
		Num3 = num3 * num4 * num4;
		
		System.out.println("원주율은 " + num3 + " 이고, " + "반지름이 "+ num4 + "인 원의 둘레는 " + Num2 +"입니다.");
		System.out.println("반지름이 "+ num4 + "인 원의 넓이는 " + Num3 +"입니다.");
		
		char charValue = '뷁';
		int inValue = charValue;
		
		
		/*		char charValue = '뷁';
		int inValue = charValue;-숫자 변환*/
		
		System.out.println(charValue + "의 문자번호는 " + inValue + "입니다.");
		
		double num33 = 58.78945;
		int inNum = (int) num33;
		
		
		System.out.println( num33 + "를 버림 하면 " + inNum + "입니다.");
		
		
		
		 
		
	}

}
