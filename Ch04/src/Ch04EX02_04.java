import java.util.*;
public class Ch04EX02_04 {
	public static void main(String [] args) {
		int sum=0;
		int count=0;
	
		for(int i=1;true;i++) {
		count++;
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		sum+=input1;
		
		if(input1>=100)
			break;
		
		}
		System.out.printf("%d\n",sum);
		System.out.printf("%.1f",(double)sum/count);
		
		
	}
}
