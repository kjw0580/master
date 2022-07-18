package generic.box;

//generic 타입을 정하지 않고 사용
public class Box<T>{
	
	private T type;
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
}
