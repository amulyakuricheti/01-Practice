package Strings;

//import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 String original = "hh", reverse = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   

//      String s = "HERO";
//      String rev = "";
	      
	      //
//      
//      for(int i =0; i<s.length(); i++	) {
//    	  rev = s.charAt(i) + rev;
//    	  System.out.println(rev);
//      }
      
      
	}

	}