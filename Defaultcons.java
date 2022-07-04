public class DefaultCons {
	private String name;
	DefaultCons()
	{
		name = "Stuti";
		System.out.println("Cons Called");
	}
	public static void main(String args[]) {
	DefaultCons obj=new DefaultCons();
	System.out.println("The name is "+obj.name);
		
	}

}
