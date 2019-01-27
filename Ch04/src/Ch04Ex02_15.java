import java.util.*;
public class Ch04Ex02_15 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		for(int i=1;i<=input1;i++){
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int a=1;a<=input1-1;a++){
			for(int b=input1-1;b>=a;b--) {
				System.out.printf("*");
			}
			System.out.println();
		}
			
	}

}
