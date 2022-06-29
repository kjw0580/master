package reference;

public class Circle {

	Point point; //객체 멤버
	int radius; //반지름
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String showInfo() {
		return "원의 중심은 ("  + point.x + ", " + point.y + "), 반지름 : " + radius;
	}
}
