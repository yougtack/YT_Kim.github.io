import java.util.*;
public class Ch04Ex01_07 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		char input1 = scan1.next().charAt(0);
		
		switch(input1) {
			case'A':
				System.out.printf("Excellent");
				break;
			case'B':
				System.out.printf("Good");
				break;
			case'C':
				System.out.printf("Usually");
				break;
			case'D':
				System.out.printf("Effort");
				break;
			case'F':
				System.out.printf("Failure");
				break;
		
			default:
				System.out.printf("error");
				
		}
		

	}
}
