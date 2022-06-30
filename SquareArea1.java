public class SquareArea1
{
	float side, area;  // declaring variable
    void insert(float s, float a) {
      side=s; 
      area=a;
      }
  void calculateArea( ) {
	  
     System.out.print(area=4*side);
  }
      static class SquareArea{  // creating another class
    	  public static void main(String[] args) {
    		  SquareArea1 r1=new SquareArea1();  // to create object
    		  r1.insert(10.5f,5.2f);  // method calling
    		  r1.calculateArea();
    	  
   }
 }
}
