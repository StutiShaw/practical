package array;
import java.util.Scanner;
public class ArrayEven
{
	    public static void main(String[] args) 
	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of array elements:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("");
	        System.out.print("Even numbers:");
	        for(int i = 0 ; i < n ; i++)
	        {
	            if(a[i] % 2 == 0)
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	    }
	}