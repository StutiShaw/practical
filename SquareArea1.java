public class SquareArea1
{
	float side, area;
    void insert(float s, float a) {
      side=s; 
      area=a;
      }
  void calculateArea( ) {
	  
     System.out.print(area=4*side);
  }
      static class SquareArea{
    	  public static void main(String[] args) {
    		  SquareArea1 r1=new SquareArea1();
    		  r1.insert(10.5f,5.2f);
    		  r1.calculateArea();
    	  
   }
 }
}