package java_00;

public class Ex_Myintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*나는 박은주 입니다.
		 * 나는 대전광역시 대덕구에 살고 있어요.
		 * 제 나이는 24 살 이예요.
		 * 키는 159.00 이고, 몸무게는 48.5랍니다.
		 * 평소에 하이볼이란 술을 좋아하고, 주량은 모르지만 1-2잔 정도 마셔요.
		 * 꼬치구이와 같이 먹는 걸 좋아합니다.
		 * 현재는 약 때문에 못 마셔요.
		 * 
		 */
		
		String name = "박은주";
		String city = "대전광역시";
		String gu = "대덕구";
		
		System.out.println("제 이름은 " + name + "입니다.");
		
		System.out.println("저는 " + city + gu + "에 살고 있어요.");
		
		String age = "24";
		
		System.out.print("제 나이는 " + Integer.parseInt(age) + "살 이예요.");
		
		String ht = "159.00";
		String kg = "48.5";
		
		
		
		System.out.println("키는 " + Float.parseFloat(ht) + "이고, " + "몸무게는 " + Float.parseFloat(kg) + "입니다.");
		
		
		
		String w = "하이볼";
		String g = "1";
		
		System.out.println("평소에 " + w + "이란 술을 좋아하고 " + "주량은 모르지만 " + Integer.parseInt(g) + "잔 정도 마셔요");
		
		String f = "꼬치구이";
		String f2 = "국물요리";	
		
		System.out.println(f + "나 " + f2 + "와 같이 먹는 걸 좋아합니다.");
		
		
		String m = "약";
		
		System.out.println("현재는 " + m + "때문에 못마셔요.");

		
		
		
	}

}
