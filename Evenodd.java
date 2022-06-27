import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
// create a scanner 
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        //read integer from user
        int num = reader.nextInt();
// check if the number is even or odd
        if(num % 2 == 0)
            System.out.println(num + " is even");// to print the statement
        else
            System.out.println(num + " is odd");// to print the statement
    }
}
