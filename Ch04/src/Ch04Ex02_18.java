import java.util.*;
public class Ch04Ex02_18 {

	public static void main(String[] args) {
		  int i,j,k; 
		  

			Scanner scan1 = new Scanner(System.in);
			int input1 = scan1.nextInt();	
			
		  for (i = 0; i < input1-1; i++) 
		  { 
		    System.out.printf(" "); 
		    for (j = 0; j < i+1; j++) 
		    { 
		      System.out.printf("#"); 
		   } 
		   System.out.println(); 
		} 
		  
		  
		for (i=input1-1; i > -1; i--) 
		{ 
		  System.out.printf(" "); 
		  for (k = 0; k < input1-i-1; k++) 
		  System.out.printf(" ");
		  for (j=0; j < i+1 ; j++) 
		  System.out.printf("#"); 
		  System.out.println(); 
		} 
	
		}
	}


