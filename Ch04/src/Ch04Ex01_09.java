import java.util.*;
public class Ch04Ex01_09 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		int input3 = scan1.nextInt();
		
		if(input1<input2 && input2<input3)
			System.out.printf("%d",input1);
		if(input1<input3 && input2>input3)
			System.out.printf("%d",input1);
		
		if(input2<input1 && input1<input3)
			System.out.printf("%d",input2);
		if(input2<input3 && input1>input3)
			System.out.printf("%d",input2);
		
		if(input3<input1 && input1<input2)
			System.out.printf("%d",input3);
		if(input3<input2 && input1>input2)
			System.out.printf("%d",input3);
		
	}
}
