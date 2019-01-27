import java.util.*;
public class Ch04Ex02_10 {

	public static void main(String[] args) {
		int sum=0;
		for(;;) {
			Scanner scan1 = new Scanner(System.in);
			int input1 = scan1.nextInt();
			
			if(!(input1%3==0 || input1%5==0))
				sum+=1;
			else if(input1==0)
				break;
		}
		System.out.printf("%d",sum);
	}

}
