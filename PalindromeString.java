package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		
		String orig = "vidya";
		  String rev = " ";
		  
		  System.out.println("Original String is " + orig);
		  char[] charArray1 = orig.toCharArray();
		  int length = charArray1.length;
		 		  
		  for(int i = length-1; i>=0; i--) {
			  
			 rev = rev + orig.charAt(i);
			  
		  }  System.out.println("Reversed string is " + rev);
			  
			  boolean isequals = orig.equals(rev);
			  if(isequals == true) {
			  System.out.println("It is a palindrome");
			  }
			  else {
				  System.out.println("It is not a palindrome");
			  }	
	
	   /* equalsIgnoreCase *********************************** 
	     boolean isequals1 = orig.equalsIgnoreCase(rev);
	  		if(isequals1 == true) {
	  			System.out.println("It is a palindrome");
	  			}
	  		else {
		  System.out.println("It is not a palindrome - case ignore");	
	   }*/
			  
	  }
	}
