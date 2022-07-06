public class Employee {  // parent/Base class
	float salary = 400000;

	}
	class Inherit extends Employee {  // child / derived /extend
		int bonus = 10000;
		public static void main(String[] args) {
			Inherit i = new Inherit();  // object of child class
			System.out.println("salary is:"+ i.salary);
			System.out.println("bonus is:"+ i.bonus);
		}
}
