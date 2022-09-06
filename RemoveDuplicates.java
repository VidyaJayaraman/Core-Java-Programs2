package week1.day2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//String text = "We learn java basics as part of java sessions in java week1";	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to remove duplicates in it");
		String text = scanner.nextLine();
		int count = 0;
		String[] text1 = text.split(" "); 
		
		 for(int i=0; i<text1.length; i++) {
			
			 for(int j=i+1; j<text1.length; j++) {
				 
				 if(text1[i].equalsIgnoreCase(text1[j]))	 
				 {
				 count = count+1;
				 text1[j]="";
			 } 
				 
			 } 
		 }
		 
		if(count>=1) {
			
	     System.out.println("output string is");	
		 for(int k=0; k<text1.length; k++) { 
		 
			 System.out.print(text1[k] + " ");
			 
	}
	
}
		else {
			System.out.println("No duplicates found");
		}
}		 	

}
			 
		