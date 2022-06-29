package array;

public class Product {
	//필드
	String productName;
	int price;
	
	//생성자
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	public String showInfo() {
		return productName + ", " + price;
	}
}
