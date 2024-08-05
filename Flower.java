class Flower{
	String color;
	String type="gerbera";
	public static void main(String[] args){
		Flower f1 =new Flower();
		f1.color="pink";
		System.out.println(f1.color);
		System.out.println(f1.type);
		Flower f2 =new Flower();
		f2.color="yellow";
		System.out.println(f2.color);
		System.out.println(f2.type);
		Flower f3 =new Flower();
		f3.color="blue";
		System.out.println(f3.color);
		System.out.println(f3.type);
	}
}