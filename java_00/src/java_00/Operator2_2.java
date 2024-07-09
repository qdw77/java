package java_00;

public class Operator2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//- >, >=, <, <=, ==(equals), !=(not equals)
		
		int a = 100;
		int b =50;
		int c = 1;
		
//		1. a가 b보다 클까요?
//		2. b가 c보다 크거나 같을까요?
//		3. a가 c보다 작을까요?
//		4. a가 b보다 작거나 같을까요?
//		5. a와 b가 같을까요?
//		6. a와 a가 다를까요?
//		7. b와 c가 다를까요?
		
		System.out.println("1. a ("+ a + ")가 b(" + b + ")보다 클까요? " + (a > b));
		System.out.println("2. b ("+ b + ")가 c(" + c + ")보다 크거나 같을까요? " + (b >= c));
		System.out.println("3. a ("+ a + ")가 c(" + c + ")보다 작을까요? " + (a < c ));
		System.out.println("4. a ("+ a + ")가 b(" + b + ")보다 작거나 같을까요? " + (a <= b));
		System.out.println("5. a ("+ a + ")가 b(" + b + ")가 같을까요? " + (a == b));
		System.out.println("6. a ("+ a + ")가 a(" + a + ")가 다를까요? " + (a != a));
		System.out.println("7. b ("+ b + ")가 c(" + c + ")가 다를까요? " + (b != c));
		
		
		
		// 사용자 나이 입력 - 19세 이상 통과, 미만 거절
		// true(통과), false(거절)
		
		int age = 24;
		boolean ageResult;
		
		ageResult = age >= 19;
		
		System.out.println("나이 : "+ age);
		System.out.println("결과 : "+ ageResult);

		// 숫자 입력 - 짝수인지, 아닌지를 판단
		
		int h = 9;
		int hResult = h %2;
		
		
		boolean hFlag;
		
		hFlag = hResult == 0;
		
		
		
		System.out.println( h + "는 짝수 입니다." + hFlag);
		
		
		
		int h2 = 4;
		int hResult2 = h2 %2;
		String hj2 = "";
		
		boolean hFlag2;
		
		hFlag2 = hResult2 == 0;
		
		hj2 = (hResult2 == 0) ? "짝수":"홀수";
		
		
		
		
		System.out.println( h2 + "는 " + hj2 + "입니다. " + hFlag2);
		
		
		
		
	}

}
