package arrayobject;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼공 자바", "신용권");
		array1[1] = new Book("반응형 웹", "조혜경");
		array1[2] = new Book("스프링부트", "채규태");
		
		array1[0] = new Book();
		array1[1] = new Book();
		array1[2] = new Book();
		
		//array1의 요소를 array2에 복사
		for(int i = 0;  i < array1.length; i++) {
			array[i].setBookName(arraay1[i].getBookName())
		}
		for(int i = 0; i < array1.length; i++) {
			array1[i].showInfo();
		}
	}

}
