import java.util.*;
public class Ch04Ex01_12 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		if(input1%400==0 || input1%4==0 && !(input1%100==0))
			System.out.printf("leap year");
		else
			System.out.printf("common year");
	}
}
