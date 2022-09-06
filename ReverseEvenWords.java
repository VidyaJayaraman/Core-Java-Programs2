package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		
	for(int i=0; i<split.length; i++) {
		
		if(i%2 == 0) {
			
			System.out.print(split[i]+ " " );
		 }
		
		else {
			char[] charArray1 = split[i].toCharArray();
	        int length = charArray1.length;
			for(int j=length-1; j>=0; j--) {
				
				System.out.print(charArray1[j]);
			}	
			
			System.out.print(" ");
		}
	}
	}
}

			