import java.util.*;
public class Ch04Ex02_02 {
	public static void main(String []args) {
		int sum=0;
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		if(input1<100) {
			int i=1;
			while(i<=input1) {
				sum+=i;
				i++;
			}
			System.out.printf("%d",sum);
		}
			
	}

}
