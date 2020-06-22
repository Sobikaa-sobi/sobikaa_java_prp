class Apple extends Fruit {
	public Apple(String name, String taste, String size) {
		super(name,taste,size);
	}
	void eat() {
		System.out.println(name+" "+taste);
	}
}
