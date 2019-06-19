import java.util.*;
public class Ch04Ex02_16 {

	public static void main(String[] args) {
			char eng ='A';
			int num = 0;
			
			Scanner scan1 = new Scanner(System.in);
			int input1 = scan1.nextInt();
			
			if(input1<=6) {
	        for (int i=0; i<input1; i++)
	        {

	        	for (int j=input1; j>i; j--)
	        	{
	        		System.out.printf("%c",eng);
	        		eng++;
	        			        
	        	}
	        	
	        	for(int k=0; k<i;k++)
	        	{
	        		System.out.printf("%d",num);
	        		num++;
	        	}
	        	
	        	System.out.println();
	        }
	        }
		}
	}


