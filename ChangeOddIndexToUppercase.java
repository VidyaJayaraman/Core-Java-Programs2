package week1.day2;

import java.util.Arrays;

public class ChangeOddIndexToUppercase {
	
	public static void main(String[] args) {
		
		String test = "changeme";	
		char[] charArray = test.toCharArray();
		int length = charArray.length;
		System.out.println("Original String : " + test);
		
        for(int i=0; i<length; i++) {
			
			if((i%2) != 0) {
				
	      	charArray[i] = Character.toUpperCase(charArray[i]);
			}
			
        }	
	
         System.out.print("Changed String : ");
        
        for(int i=0; i<length; i++) {
       
        	System.out.print(charArray[i]);
        	
	        }
	  
	    }
  
 	   
}
