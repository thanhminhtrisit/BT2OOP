package pojo;

import java.util.ArrayList;
import java.util.List;

public class TGDD {
	private List<Product> products = new ArrayList<Product>();

	public TGDD() {
		super();
	}

	public TGDD(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void display() {
		for (Product p : this.products) {
			System.out.println(p);
			System.out.println("Discount price: " +p.calculateDiscountPrice());
		}
	}
}
