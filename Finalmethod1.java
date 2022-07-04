public class Finalmethod1 {
	final void run() {
		System.out.println("Working");{
			class Finalmethod extends Finalmethod1{
				void run() {
					System.out.println("Working safely");
				}
				public static void main(String args[]) {
					Finalmethod b=new Finalmethod();
					b.run();
				}
			}
		}
	}

}
