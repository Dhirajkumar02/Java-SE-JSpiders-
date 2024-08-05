class Tree{
   String type;
   double height;
   public static void main(String [] args){
  	Tree t1 = new Tree();
	t1.type="Mango";
	t1.height=15.6;
	System.out.println(t1.type + " tree is " + t1.height);
	
	Tree t2 = new Tree();
	t2.type="Jackfruit";
	t2.height=21.8;
	System.out.println(t2.type + " tree is " + t2.height);
 
	Tree t3 = new Tree();
	t3.type="Coconut";
	t3.height=30.4;
	System.out.println(t3.type + " tree is " + t3.height);
	}
}
