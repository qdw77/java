package java_05;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*일반적으로 인자값이 있는 생성자를 자식이 받을 수 없으나 
		 * Circle에 super을 만들고 값을 넣어주면 가능하다*/
		
		//부모
		//point point = new point();
		point point = new point(1, 2);
		
		System.out.println("point x 값 : " + point.getX());
		System.out.println("point y 값 : " + point.getY());
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("point x 값 : " + point.getX());
		System.out.println("point y 값 : " + point.getY());
		
		//자식
		//Circle Circle = new Circle();
		Circle Circle = new Circle(10, 20);
		
		System.out.println("Circle x값"+ Circle.getX());
		System.out.println("Circle y값"+ Circle.getY());
		
		Circle.setX(100);
		Circle.setY(200);
		
		System.out.println("Circle x값"+ Circle.getX());
		System.out.println("Circle y값"+ Circle.getY());
	}

}
