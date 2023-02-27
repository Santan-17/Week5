package UnitTestingAssnmnt;

public class Product {
	private String productName;
	private float price;
	private int stock;
	
	public float calculateFinalPrice(int discountPercentage) {
	float discountedPrice = price - (price * discountPercentage / 100);
	return discountedPrice;
	}
	 
	public String getProductName() {
	return productName;
	}
	 
	public void setProductName(String productName) {
	this.productName = productName;
	}
	 
	public float getPrice() {
	return price;
	}
	 
	public void setPrice(float price) {
	this.price = price;
	}
	
	public int getStock() {
	return stock;
	}
	
	public void setStock(int stock) {
	this.stock = stock;
	}
}
