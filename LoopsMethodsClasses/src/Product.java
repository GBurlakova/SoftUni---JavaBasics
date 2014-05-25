
public class Product implements Comparable<Product>{
	private double Price;
	private String Name;
	
	
	public Product(double price, String name) {
		super();
		Price = price;
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
//	@Override
//	public String toString() {
//		return this.Price + " " + this.Name;
//	}
	
	@Override
	public String toString() {
		return String.format("%.2f %s", this.Price, this.Name);
	}
	
	@Override
	public int compareTo(Product product) {
		return Double.compare(this.Price, product.Price);
	}

}
