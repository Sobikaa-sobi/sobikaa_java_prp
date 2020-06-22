
public class Fruit {
	String name;
	public Fruit(String name, String taste, String size) {
		super();
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	String taste;
	String size;
	void eat() {
		System.out.println(name+" "+taste);
	}
}
