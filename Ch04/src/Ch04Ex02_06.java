import java.util.*;
public class Ch04Ex02_06 {

	public static void main(String[] args) {
		
		for(;;) {
		System.out.printf("1.Korea\n2.USA\n3.Japan\n4.China\nnumber?");
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		System.out.println();
		
		if(input1==1)
			System.out.printf("Seoul\n");
		else if(input1==2)
			System.out.printf("Washington\n");
		
		else if(input1==3)
			System.out.printf("Tokyo\n");
		
		else if(input1==4)
			System.out.printf("Beijing\n");
		
		else
			break;
		
		System.out.println();
		}
	}
}
