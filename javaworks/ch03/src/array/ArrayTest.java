package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//숫자를 5개 저장할 배열
		int[] num = new int[] {90, 80, 100, 75, 95};
		
		for(int i : num) {
			System.out.println(i);
		}
		
		//문자열을 3개 저장할 배열
		String[] str = {"사과", "참외", "수박"};
		
		for(String s : str) {
			System.out.println(s);
		}
		
		//제품을 3개 저장할 배열
		Product[] product = new Product[3];
		product[0] = new Product("notebook", 1000000);
		product[1] = new Product("smartPhone", 2000000);
		product[2] = new Product("AI speaker", 3000000);
		
		//
		for(int i = 0; i < product.length; i++ ) {
			System.out.println(product[i].showInfo());	
		}
		
		//향상 for
		for(Product p : product) {
			System.out.println(p.showInfo());
		}
	}

}
