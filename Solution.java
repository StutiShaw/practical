package string;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Solution {


	    public static void main(String []args)
	    {
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext())
	        {
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}

	//YOU SHOULD ONLY SUBMIT THE FOLLOWING BLOCK
	class MyRegex
	{
	         String pattern = 
	            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	}