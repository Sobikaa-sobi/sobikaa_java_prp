
public class Book extends Author {
	String Bname;
	Author author;
	double price;
	int qtyInStock;
	public String getBName() {
		return Bname;
	}
	public void setBName(String Bname) {
		this.Bname = Bname;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public Book(String name, String email, char gender,String Bname, Author author, double price, int qtyInStock) {
		super(name, email, gender);
		this.Bname = Bname;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		return "Book [Bname=" + Bname + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock
				+ ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
