package entities;

public class OrderItem {

	private int quantity;
	private double price;
	
	private Product product;

	public OrderItem() {
	}
	
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public Product getProducts() {
		return product;
	}

	public void setProducts(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		return product.getName() + " " + price + " " + "Quantity: " + quantity + " " + "Subtotal: " + "$" + subTotal();
	}
	
}
