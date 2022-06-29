package reference;

public class Point {
	//점 클래스
	//필드 (field)
	int x;
	int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showinfo() {
		System.out.println("점(" + x + ", " + y +")");
	}
}
