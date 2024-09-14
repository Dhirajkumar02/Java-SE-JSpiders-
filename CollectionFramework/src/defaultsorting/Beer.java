package defaultsorting;

public class Beer implements Comparable<Beer> {
	String brand;
	Double cost; // Wrapper class declaration to call compareTo() of Double class
	Beer(String brand, double cost) {
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand +" Cost: ₹"+cost;
	}
	@Override
	public int compareTo(Beer b) {
		return this.cost.compareTo(b.cost);
	}

}

//this -> current objects to be inserted
//b-> already existing object
//for Double sorting, use compareTo() of Double class
//Ascending -> return  this.name.compareTo(b.name);
//Descending -> return  b.name.compareTo(this.name);
