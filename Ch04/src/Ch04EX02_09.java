import java.util.*;
public class Ch04EX02_09 {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(;;) {
			Scanner scan1 = new Scanner(System.in);
			int input1 = scan1.nextInt();
			
			if(input1<=100)
			sum+=input1;
			
			else
				break;
			count++;
		}
		System.out.printf("sum:%d\n",sum);
		System.out.printf("avg:%.1f",(double)sum/count);
	}

}
