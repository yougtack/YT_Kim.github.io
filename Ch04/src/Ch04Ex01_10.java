import java.util.*;
public class Ch04Ex01_10 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		
		if(input1>input2)
			System.out.printf("%d",input1-input2);
		else if(input1<input2)
			System.out.printf("%d",input2-input1);
	}
}
