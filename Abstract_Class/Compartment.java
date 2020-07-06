abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment{
	public String notice() {
		return "First Class Compartment";
	}
	 
 }

class Ladies extends Compartment{
	public String notice() {
		return "Ladies Compartment";
	}

}

class General extends Compartment{
	public String notice() {
		return "General Compartment";
	}
	
}

class Luggage extends Compartment{
	public String notice() {
		return "Luggage Compartment";
	}
}