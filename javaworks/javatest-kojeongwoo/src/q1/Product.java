package q1;

public class Product {

	private String productName;
	
	public Product() {}
	
	public Product(String productName) {
		this.productName = productName;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}

	public void show() {
		System.out.println(productName);
	}
	
}
