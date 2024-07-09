package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		int f = 1;

		
		String f2 = "";
		String food = "";
		
		f2 = (f > 1 && f == 2) ? "소" : "닭";
		food = (f < 2 && f == 1) ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은 " + f2 + "이므로, " + food + "을(를) 요리하겠습니다.");
		System.out.println();
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
		
		int h = 4;

		int h2;
		
		String h3 ="";
		
		h2 =  h % 2 ;
		
		h3 = (h2 == 1) ? "홀수" : "짝수";

		System.out.println("입력하신 숫자 " + h + "은(는) " + h3 + "입니다");
		System.out.println();
		
		
		
		
		float f7 = 10.456f;
		//f로 자리수 조절
		System.out.println(f7);
		String result = "";
		
		result = (f7 % 2 ==0) ? "짝수" : "홀수"; 
		
		System.out.println("입력한 숫자" + f7 + "는 " + result + "입니다.");
		
		
		
		/*
		 * [평균 구하기]
		 * 
		 * 입력 값 : 국어, 영어, 수학
		 * 조건1) : 국어, 영어, 수학 점수의 평균을 구하여 85점 이상이면 합격 / 미만이면 불합격
		 * 조건2) : 평균 점수는 소수점 /두자리/까지 표시
		 * 
		 * 결과물 예시 :
		 * 당신의 국어 점수는 85점 입니다.
		 * 당신의 영어 점수는 90점 입니다.
		 * 당신의 수학 점수는 60점 입니다.
		 * 
		 *  당신의 평균 점수는 78.33 이고 불합격 입니다.
		 * */
		

		
		
		
		
		
		int p1 = 85;
		int p2 = 90;
		int p3 = 61;
		String p5 ="";
		
		//float p4 = (float)(p1+p2+p3)/3;
		//float p4 = (p1+p2+p3) / 3.0f;
		double p4 = (p1+p2+p3) / 3.0;
		
		p5 = (p4 > 85) ? "합격":"불합격";
		System.out.println("국어 점수는" + p1 + "점입니다.");
		System.out.println("영어 점수는" + p2 + "점입니다.");
		System.out.println("수학 점수는" + p3 + "점입니다.");
		
		
		System.out.println("당신의 평균 점수는 " + p4 + "이고, " + p5 + "입니다.");
		
		
		
		
		/*
		int kor = 85;
		int eng = 90;
		int math = 61;
		int sum;
		double avg;
		String avgResult = "";
		
		sum = kor + eng + math;
		avg = sum/3.0;
		
		avgResult = (avg >= 85) ? "합격" : "불합격";
		
		System.out.println("당신의 평균 점수는 " + avg + "이고, " + avgResult + "입니다.");
		*/
	}
}
