public class RectangleParameter { // creating a class
	int length;
	int width;
	void insert(int l,int w) { 
		length=l;
		width=w;
		}
   void calculateParameter() {  // creating method
	   System.out.println(2*(length+width)); } 
   }
class RectangleParameter1{  // creating another class
public static void main(String[] args) {
  RectangleParameter r1=new RectangleParameter(); // to creating object
  r1.insert(10,8);  // to calling main method
  r1.calculateParameter();
 
	}
}
