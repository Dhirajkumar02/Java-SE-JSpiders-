class Country{
	String name;
	long population;
	public static void main(String[] args){
		Country c1=new Country();
		c1.name="India";
		c1.population=141;
		System.out.println(c1.name+" has a population of "+c1.population+" Crores.");

		Country c2=new Country();
		c2.name="China";
		c2.population=141;
		System.out.println(c2.name+" has a population of "+ c2.population+" Crores.");

		Country c3=new Country();
		c3.name="USA";
		c3.population=33;
		System.out.println(c3.name+" has a population of "+c3.population+" Crores.");
	}
}