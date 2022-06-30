public class DefaultCons {
	private String name;
	DefaultCons() //creating a constructor
	{
		name = "Stuti";
		System.out.println("Cons Called");
	}
	public static void main(String args[]) {
	DefaultCons obj=new DefaultCons();  // creating object
	System.out.println("The name is "+obj.name);
		
	}

}
