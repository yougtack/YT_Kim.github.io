import java.util.*;
public class Ch04Ex02_17 {

	public static void main(String[] args) {
			char eng ='A';
			int num = 1;
			
			Scanner scan1 = new Scanner(System.in);
			int input1 = scan1.nextInt();
			
			
	        for (int i=0; i<input1; i++)
	        {

	        	for(int j=0; j<i;j++)
	        	{
	        		System.out.printf(" ");
	        	}
	        	

	        	for (int k=input1; k>i; k--)
	        	{
	        		System.out.printf("%d",num);
	        		num++;
	        	
	        		if(num>9)
	        			num=0;
	        	}
	        	       	
	        	System.out.println();

	        }
		}
	}


