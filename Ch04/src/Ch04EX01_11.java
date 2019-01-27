import java.util.*;
public class Ch04EX01_11 {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		if(input1>0)
			System.out.printf("plus");

		else if(input1==0)
			System.out.printf("zero");

		else if(input1<0)
			System.out.printf("minus");

	}

}
