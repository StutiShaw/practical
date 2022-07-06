public class Main { // parent class
    int a= 5000;
}
class Base extends Main{ // base class
	int b=600;
		
	int add=a+b;
	public static void main(String args[])
	{
		Base obj=new Base(); // creating object of child class
		System.out.println("Addition  is :"+obj.add);
		
	}
}