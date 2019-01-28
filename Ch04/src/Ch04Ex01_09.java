import java.util.*;
public class Ch04Ex01_09 {
	public static void main(String [] args) {
		int sum=0;
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		int input3 = scan1.nextInt();
		
		sum = (input1<input2) ?input1:input2;
		sum = (input2<input3) ? input2:input3;
		System.out.printf("%d",sum);
	}
}