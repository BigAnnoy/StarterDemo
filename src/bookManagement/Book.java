package bookManagement;

/**
 * 
 * @author BigAnnoy
 *Last_update	Aug 24, 201811:50:26 AM
 *
 */
public class Book {
	private String name;
	private double price;
	private int num;
	
	public Book() {};
	
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public Book(String name, double price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
