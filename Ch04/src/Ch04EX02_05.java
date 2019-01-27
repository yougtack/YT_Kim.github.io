import java.util.*;
public class Ch04EX02_05 {
	public static void main(String [] args) {
		
		for(;;) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		if(input1%3==0)
			System.out.printf("%d\n",input1/3);
		
		else if(input1==-1)
			break;
		}
	}
}
