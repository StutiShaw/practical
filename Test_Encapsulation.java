package com;

public class Test_Encapsulation {
	public static void main(String[] args) {  
	    Account account=new Account();
	    account.setName("Stuti Shaw"); 
	    account.setEmail("stutishaw2001@gmail.com");  
	    account.setAcc_no(9320555111L);     
	    account.setAmount(60000f);  
	    // getting the value  
	    System.out.println(account.getName()); 
	    System.out.println(account.getEmail()); 
	    System.out.println(account.getAcc_no()); 
	    System.out.println(account.getAmount()); 
	}  
}
