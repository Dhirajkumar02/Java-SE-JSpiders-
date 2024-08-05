class Car{
	String color="blue";
	String brandName;
	public static void main(String[] args){
	Car c1 = new Car();
	c1.brandName = "BMW";
	System.out.println(c1.color + " " + c1.brandName);
	Car c2 = new Car();
	c2.brandName = "TATA MOTOR";
	System.out.println(c2.color + " " + c2.brandName);
	Car c3 = new Car();
	c3.brandName = "MERCEDES";
	System.out.println(c3.color + " " + c3.brandName);
	Car c4 = new Car();
	c4.color ="red";
	c4.brandName ="AUDI";
	System.out.println(c4.color + " " + c4.brandName);
	}
}