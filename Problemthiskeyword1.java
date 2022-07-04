public class Problemthiskeyword1 {
	int rollno;
    String name;
    float fee;
    Problemthiskeyword1(int rollno,String name, float fee){
   	 this.rollno=rollno;
   	 this.name=name;
   	 this.fee=fee;
    }
    void display() {
   	 System.out.println(rollno+" "+name+" "+fee  );
    }
    public class Problemthiskeyword{
   	 public static void main(String[] args) {
   		Problemthiskeyword1 s1 = new Problemthiskeyword1(10,"Jaita",5000);
   		Problemthiskeyword1 s2 = new Problemthiskeyword1(11,"Arpan",4000);
   		 s1.display();
   		 s2.display();
   		 }
   	 }
}