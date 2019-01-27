import java.util.*;
public class Ch04Ex02_08 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		
		for(;;) {
			Scanner scan1 = new Scanner(System.in);
			int input1 = scan1.nextInt();

			if(input1%2==0 && !(input1==0))
				num1++;
			else if(input1%2==1 && !(input1==0))
				num2++;
			else 
			break;
			
		}
		System.out.printf("odd:%d\n",num2);
		System.out.printf("even:%d",num1);
	}

}
