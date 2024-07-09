package java_05;

public class point {

	private int x;
	private int y;
	
	public point() {  
		System.out.println("point 부모 생성자 호출 - 기본 생성자");
		
		this.x = 0;
		this.y = 0;
		
	}
	
	public point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("point 부모 생성자 호출 - 인자값이 있는 생성자");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
