package samp10.model;
public class Product {
	private String name;
	private int price;
	public Product(String name,int price) {
		this.name  = name;
		this.price = price;
	}
	public String toString() {
		return "상품[이름:"+name+", 가격:"+price+"]";
	}
}