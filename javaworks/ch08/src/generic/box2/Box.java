package generic.box2;

//비 제네릭 타입
public class Box {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}
