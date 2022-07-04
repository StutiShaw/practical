public class Staticvariable1 {
	int rollno;
	String name;
    static String college="Regent";
    static void change() {
    	college="ITC";
    }
    Staticvariable1 (int r ,String n) {
    	rollno=r;
    	name=n;
    }
    void display() {
   	 System.out.println(rollno+" "+name+" "+college);
    }
    public class Staticvariable{
   	 public static void main(String[] args) {
   		 Staticvariable1.change();
   	 
   		Staticvariable1 s1 = new Staticvariable1(10,"Stuti");
   		 Staticvariable1 s2 = new Staticvariable1(11,"Simran");
   		 s1.display();
   		 s2.display();
   		 }

}
}